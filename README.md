# Rally Transbetxí App 🏁

## Table of Contents
- [Project Overview](#project-overview)
- [Repository Status](#repository-status)
- [Technologies Used](#technologies-used)
- [About the Rally](#about-the-rally)
- [Current App State](#current-app-state)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [License](#license)
- [Contact](#contact)

## Project Overview

This repository contains information about the Rally Transbetxí App, a mobile application designed to bring real-time updates and results to spectators of the traditional Transbetxí Rally. The app allows fans to follow the race progress, view stage times, and stay updated with the latest news about the event.

## Repository Status

**Important Note:** This repository serves as an informational showcase only and does not contain the application's source code. The code remains private as the project is being developed for eventual transfer to the Rally Transbetxí organization, which prefers to maintain the codebase as proprietary software. This documentation is provided to demonstrate the technical concepts and approaches used in the development process.

## Technologies Used

This project leverages cutting-edge mobile development technologies to provide a seamless cross-platform experience while maintaining native performance. The technical stack includes:

### Cross-Platform Foundation
- **Kotlin Multiplatform Mobile (KMM)** - Used to share code across *all* architectural layers:
  - Data layer (repositories, data sources)
  - Domain layer (business logic, use cases)
  - Presentation layer (ViewModels)
  - Even parts of the UI layer (common components)

### Platform-Specific UI
- **Jetpack Compose** - Modern declarative UI toolkit for Android
- **SwiftUI** - Native declarative UI framework for iOS
- **Material Design 3** - For consistent, modern UI components and theming on Android

### Mapping & Location Services
- **Google Maps API** - For Android stage mapping and navigation
- **Apple Maps** - Custom native implementation for iOS stage mapping
- **Platform-specific location APIs** - For determining user position and providing directions to stage starting points

### Backend & Data
- **Firebase Ecosystem**
  - Firestore for structured data (participant information, stage details)
  - Storage for media assets (photos, stage maps)
  - Authentication for admin capabilities
  - Security Rules with Google Play Store App Check integration for data protection
- **GitLive Firebase** - Kotlin-first Firebase libraries for cross-platform implementation (as official KMP Firebase support remains limited as of 2025)

### Architecture & Utilities
- **Clean Architecture** - For maintainable separation of concerns
- **MVVM Pattern** - For UI state management
- **Kotlin Coroutines & Flows** - For asynchronous programming and reactive data streams
- **Koin** - For dependency injection across platforms
- **Ktor Client** - For additional network communications
- **Room** - For local data persistence on Android
- **DataStore** - For preferences and small data storage
- **Compose Navigation** - For routing within the Android application

## About the Rally

Just like every year since 1988, the [Rally Transbetxí](https://www.transbetxi.com/) returns to Betxí, Castellón (Spain), featuring a **unique motorsport event** – the motocultor rally. A motocultor is a small agricultural machine with no more than 10 horsepower. While its power might not be impressive, things change when we swap the original engine for a modified 250cc Bultaco engine, producing around 40 horsepower and reaching speeds of up to 100 kilometers per hour. Quite a transformation, right? 🏎️💨

With the increased power comes the need for improved brakes, suspensions, and tires. Even so, motocultores remain somewhat unstable, leading to the formation of two-member teams: a rider and a co-pilot who acts as a counterbalance during turns, much like a sidecar passenger.

![Motocultor Vehicle](images/Motoret.jpg)  
*Photo credits: [Alejandro Tinieblas](https://www.alejandromilart.com/motorets-transbetxi-2018/)*

This well-established competition revolves around this concept, and this year it introduces an exciting addition: our mobile application that allows spectators to follow live timing results and get real-time updates on the race progress. Now you can stay connected with all the action happening on the track, witnessing the motocultores incredible speed and skill firsthand.

📢 Join us as we celebrate the legacy of the **Rally Transbetxí**.  
📆 **Saturday, April 26, 2025**, until **Sunday, April 27, 2025**.  
📍 **Betxí, Castellón (Spain)**  
🌐 [https://www.transbetxi.com/](https://www.transbetxi.com/)

## Current App State

Under construction 🚧  
*The application is currently in active development with a private testing phase underway. Due to the timeline of discussions with the rally organization, the app will not be publicly available for the 2025 edition. We are targeting a full public release for the 2026 event, with limited testing for this year's rally.*

## Screenshots

| ![Home Screen](images/Home.jpg) | ![Settings BottomSheet](images/Ajustes.jpg) |
|:------------------------------------:|:-----------------------------:|
| **Home Screen** | **Settings** |

| ![Home News](images/Home_Noticias.jpg) | ![Stages](images/Tramos.jpg) |
|:------------------------------------:|:-----------------------------:|
| **Home Screen with news section** | **Stages screen** |

| ![Stage detail](images/Tramos_Detalle.jpg) | ![Results](images/Resultados.jpg) |
|:------------------------------------:|:-----------------------------:|
| **Stage detail screen** | **Results screen** |

## Installation

While the application will not be publicly available for the 2025 rally, a private beta testing program is in place. If you're interested in participating:

- **Google Play Beta**: I can provide direct access through Google Play's testing program with just a valid email address (no APK download required)
- **iOS TestFlight**: Limited spots available for iOS testing

Contact me directly via the information in the Contact section if you'd like to participate in the beta testing program.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

For more information about the app or the rally, feel free to contact:  
GitHub: [@xicotet](https://github.com/Xicotet)  
LinkedIn: [Pablo Cano Franch](https://www.linkedin.com/in/canolabs)
