package com.canolabs.rallytransbetxi.data.repositories

import com.canolabs.rallytransbetxi.data.models.responses.Stage
import com.canolabs.rallytransbetxi.data.sources.remote.StagesServiceImpl
import javax.inject.Inject

interface StagesRepository {
    suspend fun getStages(): List<Stage>
}

class StagesRepositoryImpl @Inject constructor(
    private val stagesServiceImpl: StagesServiceImpl
) : StagesRepository {
    override suspend fun getStages(): List<Stage> {
        return stagesServiceImpl.fetchStages()
    }
}