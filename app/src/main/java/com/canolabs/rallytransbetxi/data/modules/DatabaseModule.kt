package com.canolabs.rallytransbetxi.data.modules

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.canolabs.rallytransbetxi.data.models.storage.AppSetting
import com.canolabs.rallytransbetxi.data.sources.local.dao.AppSettingsDao
import com.canolabs.rallytransbetxi.data.sources.local.database.AppDatabase
import com.canolabs.rallytransbetxi.utils.Constants.Companion.DATABASE_NAME
import com.canolabs.rallytransbetxi.utils.Constants.Companion.DEFAULT_LANGUAGE
import com.canolabs.rallytransbetxi.utils.Constants.Companion.DEFAULT_PROFILE
import com.canolabs.rallytransbetxi.utils.Constants.Companion.DEFAULT_THEME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    private lateinit var appDatabase: AppDatabase

    private val callback = object : RoomDatabase.Callback() {
        override fun onOpen(db: SupportSQLiteDatabase) {
            super.onOpen(db)
            // Dispatchers.IO is used because the callback is run on the main thread
            CoroutineScope(Dispatchers.IO).launch {
                val count = appDatabase.settingsDao().getSettingCount()
                if (count == 0) {
                    appDatabase.settingsDao().insertSetting(AppSetting(
                        1,
                        DEFAULT_LANGUAGE,
                        DEFAULT_THEME,
                        DEFAULT_PROFILE
                    ))
                }
            }
        }
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        // First we check if the database is not initialized
        if (!::appDatabase.isInitialized) {
            appDatabase = Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                DATABASE_NAME
            )
            .addCallback(callback)
            .fallbackToDestructiveMigration()
            .build()
        }
        return appDatabase
    }

    @Provides
    fun provideSettingsDao(appDatabase: AppDatabase): AppSettingsDao {
        return appDatabase.settingsDao()
    }
}