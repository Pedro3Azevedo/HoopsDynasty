# Hoops Dynasty - NBA Manager Simulation Game

An Android mobile application that puts you in control of an NBA team as a manager. Build your roster, make strategic decisions, compete in a simulated season, and lead your dynasty to championship glory.

**Course**: Mobile Application Development (DAM)  
**Institution**: Instituto Superior de Engenharia de Lisboa (ISEL)  
**Author**: Pedro Azevedo (A47094)  
**Date**: July 5, 2023

---

## Project Overview

**Hoops Dynasty** is a realistic NBA Manager simulation game designed for basketball enthusiasts. Players assume the role of an NBA team manager, building and managing their own team through strategic decisions, roster management, and competitive gameplay.

### Key Vision
Create an engaging and immersive experience that authentically simulates the role of an NBA team manager, combining team-building strategy with tactical gameplay driven by real NBA player statistics.

---

## Objectives

1. **Learn Android Development Technologies**
   - Firebase Authentication and Realtime Database
   - Room Database for local persistence
   - Jetpack Compose for modern UI development
   - Android Studio development environment

2. **Apply UX Design Methodology**
   - Follow a structured development process (Concept → Pre-Production → Production → Post-Production)
   - User-centered design approach
   - Iterative mockup refinement based on user feedback

3. **Build Complete Android Application**
   - Implement full-stack Android app with backend integration
   - Apply MVVM architectural pattern
   - Create database schema for game state management
   - Develop engaging user interface with Jetpack Compose

---

##  Architecture

### Architectural Pattern: MVVM (Model-View-ViewModel)

```
┌──────────────────────────────────┐
│   View (Jetpack Compose)        │
│   - Login Screen                │
│   - Team Selection              │
│   - Home Page                   │
│   - Roster Management           │
│   - Calendar                    │
│   - Standings                   │
│   - Marketplace                 │
│   - Game Simulation             │
└──────────────┬───────────────────┘
               │
        ┌──────▼──────┐
        │  ViewModel  │
        │  - Logic    │
        │  - State    │
        │  - Operations│
        └──────┬──────┘
               │
        ┌──────▼──────────────┐
        │  Repository Layer   │
        │  (Data Access)      │
        └──────┬──────────────┘
               │
        ┌──────┴─────────────┬────────────────┐
        │                    │                │
    ┌───▼────┐        ┌─────▼──┐      ┌─────▼──────┐
    │  Room   │        │Firebase│      │   NBA API  │
    │Database │        │Backend │      │  (Players) │
    └────────┘        └────────┘      └────────────┘
```

### Key Components

**Model Layer (Data)**
- Room Database for local game state
- Firebase Realtime Database for cloud synchronization
- Entity classes: Manager, Team, Player, Game, Season

**ViewModel Layer (Logic)**
- Manages UI state and business logic
- Retrieves data from repositories
- Exposes data and operations to views
- Handles lifecycle-aware operations

**View Layer (UI)**
- Jetpack Compose declarative UI
- Reactive to ViewModel state changes
- User interaction handling
- Navigation between screens

---

### Storage Technology: Room Database + Firebase

**Room Database**
- Local persistence for offline functionality
- Compile-time SQL query verification
- Automatic mapping to Kotlin objects
- Clean data access layer via DAOs (Data Access Objects)

**Firebase Integration**
- Authentication: User registration and login
- Realtime Database: Cloud synchronization
- JSON data format for flexible schema

---

## Core Features

### 1. User Authentication
- Email/password registration
- Firebase Authentication integration
- Secure user session management
- Account persistence

### 2. Team Selection & Management
```
User Registration
        ↓
Choose NBA Team (30 teams available)
        ↓
Set Starting Lineup & Bench (10 players total)
        ↓
Save to Firebase & Local Database
```

- Browse all 30 NBA teams
- Set starting lineup (5 players)
- Configure bench players (5 players)
- Drag-and-drop roster management
- Player position customization

### 3. Home Dashboard
- Team information display
- Current record (wins/losses)
- Starting lineup preview
- Next scheduled game
- Quick navigation to other features

### 4. Roster Management
- View all team players with ratings
- Player statistics display
- Drag-and-drop to adjust positions
- Rating-based visual indicators (color-coded circles)
- Sort and filter options

### 5. Season Calendar
- View upcoming games schedule
- Team matchups
- Game dates and times
- Quick access to game simulation

### 6. Standings
- View league standings (all 30 teams)
- Win-loss records for all teams
- Rankings and playoff positioning
- Real-time updates

### 7. Marketplace (Player Trading)
- Browse available players not on any team
- Player cards with stats and ratings
- Purchase players with virtual currency
- Dynamic pricing based on player rating
- Filter by position

### 8. Game Simulation
- Real-time game simulation engine
- Driven by player statistics
- Position-relevant stat weighting
- Quarter-by-quarter progression display
- Final score and winner announcement
- Box score statistics (future enhancement)

---

## Technology Stack

### Mobile Framework
- **Android** - Operating system
- **Kotlin** - Programming language
- **Android Studio** - Development IDE

### UI & Presentation
- **Jetpack Compose** - Declarative UI toolkit
  - Modern, reactive UI framework
  - Declarative programming model
  - Eliminates XML layout files
  - Real-time preview and live reload

### Architecture & Design Patterns
- **MVVM** (Model-View-ViewModel)
  - Separation of concerns
  - Testable components
  - Reactive data binding
- **Repository Pattern** - Data abstraction layer

### Database & Storage
- **Room** - Android persistence library
  - Type-safe database access
  - SQL query compile-time checking
  - Automatic object mapping
  - Live data support

- **Firebase** - Backend-as-a-Service
  - Firebase Authentication
  - Realtime Database (JSON storage)
  - Cloud synchronization

### Data Source
- **NBA API** - Real player statistics
  - Player data
  - Season statistics
  - Performance metrics
  - Team information

### Additional Libraries
- **Gradle** - Build automation
- **Android Jetpack Components**
  - LiveData - Lifecycle-aware observables
  - ViewModel - UI state management
  - Navigation - Screen routing
  - Lifecycle - Component lifecycle handling


### Key Screens

**1. Login/Register**
- Email input
- Password field
- Registration form
- Firebase authentication

**2. Team Selection**
- Horizontal scroll through 30 NBA teams
- Team logos and names
- Single-select interface
- Roster auto-generation with real NBA players

**3. Home Page**
- Team logo and name
- Win/loss record display
- Starting 5 lineup preview
- Next game information
- Navigation menu

**4. Roster Management**
- Player cards with ratings
- Drag-and-drop positioning
- Color-coded rating indicators
- Position labels
- Stats summary per player

**5. Calendar/Schedule**
- Upcoming games list
- Game date and opponent
- Quick simulation button
- Season progress tracker

**6. Standings**
- League-wide rankings
- All 30 teams listed
- Win-loss-tie records
- Conference/division breakdown
- Real-time updates

**7. Marketplace**
- Available player browse
- Player cards with stats
- Price display (rating-based)
- Purchase button (not yet implemented)
- Filter/search options

**8. Game Simulation**
- Real-time gameplay display
- Team lineups shown
- Quarter-by-quarter score updates
- Clock/timer display
- Play-by-play events

**9. Game Results**
- Final score display
- Winning team highlight
- Box score summary
- Player performance stats
- Return to home button

---

## Design Process

### Phase 1: Concept
- Brainstorm app idea and name
- Define target audience (basketball fans)
- List core features
- Create wireframes for main screens
- Design initial entity-relationship diagram
- Establish Firebase backend strategy

### Phase 2: Pre-Production
- Create high-fidelity mockups (3 design variations)
- Conduct user feedback session on design preferences
- Refine mockups based on feedback
- Create complete entity-relationship diagram with attributes
- Plan data flow and API integration
- Finalize UI/UX specifications

### Phase 3: Production
- Set up Android project in Android Studio
- Configure Firebase project
- Implement Room database schema
- Create entity classes and DAOs
- Build ViewModels and Repositories
- Implement all UI screens with Jetpack Compose
- Integrate Firebase Authentication
- Implement game simulation engine

### Phase 4: Post-Production (Planned)
- Performance optimization
- Bug fixes and refinement
- User feedback integration
- Additional features implementation
- Release to Play Store

---

## Game Mechanics

### Team Building
1. **Draft Selection** - Choose your NBA team from 30 options
2. **Roster Construction** - Build 10-player roster (5 starters + 5 bench)
3. **Lineup Adjustment** - Change formations and player positions
4. **Player Upgrades** - Purchase better players from marketplace

### Gameplay
- **Game Simulation** - Automated play generation based on player stats
- **Stat-Driven Outcomes** - Real NBA statistics influence game results
- **Position-Based Logic** - Guards focus on shooting, Centers on rebounding, etc.
- **Season Progression** - Play through entire 82-game NBA season

### Economy
- **Virtual Currency** - Earn money by winning games
- **Player Costs** - Purchase prices based on player ratings
- **Budget Management** - Manage team salary cap (future enhancement)
- **Player Trading** - Buy/sell players in marketplace


## 🎓 Learning Outcomes

Upon completing this project, the developer demonstrates:

✅ **Android Development Proficiency**
- Kotlin programming language mastery
- Android Studio IDE competency
- Android lifecycle understanding

✅ **Modern Android Architecture**
- MVVM pattern implementation
- Reactive programming with LiveData
- Separation of concerns

✅ **Database Design & Implementation**
- SQL schema design
- Room database usage
- Data persistence patterns

✅ **Cloud Integration**
- Firebase Authentication
- Real-time database synchronization
- Backend-as-a-Service usage

✅ **UI Development**
- Jetpack Compose declarative UI
- Responsive design
- User interaction handling

✅ **UX Design Process**
- Wireframing and mockup creation
- User feedback integration
- Iterative design refinement

✅ **Full-Stack Development**
- Frontend development
- Backend integration
- Data flow management

## 📖 Development Challenges & Solutions

### Challenge 1: Player Data Management
**Problem**: Sourcing and organizing comprehensive NBA player statistics  
**Solution**: Integrated NBA API for real-time player data, cached locally in Room

### Challenge 2: Room Database Learning Curve
**Problem**: Understanding LiveData, DAOs, and Entity relationships  
**Solution**: Iterative learning, documentation review, practical implementation

### Challenge 3: Jetpack Compose UI Development
**Problem**: Learning declarative UI paradigm (different from traditional XML)  
**Solution**: Practice with compose documentation, incremental screen building

### Challenge 4: Drag-and-Drop Implementation
**Problem**: Complex roster reordering with UI updates  
**Solution**: Jetpack Compose drag-and-drop APIs, state management optimization

### Challenge 5: Game Simulation Accuracy
**Problem**: Creating realistic match outcomes based on stats  
**Solution**: Position-weighted stat aggregation with variance factors

---

##  Development Environment

**IDE**: Android Studio  
**Language**: Kotlin  
**Min SDK**: Android 7 (API 24)  
**Target SDK**: Android 13+  
**Build Tool**: Gradle  
**Version Control**: Git  

---

## 📋 Project Structure

```
HoopsDynasty/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/hoopsdynasty/
│   │   │   │   ├── ui/
│   │   │   │   │   ├── LoginScreen.kt
│   │   │   │   │   ├── HomeScreen.kt
│   │   │   │   │   ├── RosterScreen.kt
│   │   │   │   │   ├── GameScreen.kt
│   │   │   │   │   └── ...
│   │   │   │   ├── viewmodel/
│   │   │   │   │   ├── AuthViewModel.kt
│   │   │   │   │   ├── TeamViewModel.kt
│   │   │   │   │   ├── GameViewModel.kt
│   │   │   │   │   └── ...
│   │   │   │   ├── data/
│   │   │   │   │   ├── local/
│   │   │   │   │   │   ├── PlayerEntity.kt
│   │   │   │   │   │   ├── TeamEntity.kt
│   │   │   │   │   │   ├── PlayerDAO.kt
│   │   │   │   │   │   └── HoopsDynastyDatabase.kt
│   │   │   │   │   ├── remote/
│   │   │   │   │   │   └── FirebaseService.kt
│   │   │   │   │   └── repository/
│   │   │   │   │       ├── PlayerRepository.kt
│   │   │   │   │       └── TeamRepository.kt
│   │   │   │   └── model/
│   │   │   │       ├── Player.kt
│   │   │   │       ├── Team.kt
│   │   │   │       └── Game.kt
│   │   │   ├── AndroidManifest.xml
│   │   │   └── res/
│   │   └── test/
│   └── build.gradle
└── build.gradle
```

## 📄 License

Educational use only. Project completed as coursework for Mobile Application Development (DAM) at ISEL.

---

## 👤 Author

**Pedro Azevedo** (A47094)  
**Licenciatura em Engenharia Informática e Multimedia**  
**Instituto Superior de Engenharia de Lisboa (ISEL)**  
**Course**: Mobile Application Development (DAM)  
**Instructor**: Engenheiro Pedro Fazenda  
**Date Completed**: July 5, 2023


## 📚 Technologies & Frameworks

| Category | Technology |
|---|---|
| Language | Kotlin |
| Framework | Android |
| UI Toolkit | Jetpack Compose |
| Database | Room + Firebase |
| Backend | Firebase Realtime DB |
| Architecture | MVVM |
| Build Tool | Gradle |
| IDE | Android Studio |
| API | NBA API |


##  Conclusion

Hoops Dynasty demonstrates the complete mobile application development process from concept through production. By combining UX design principles with modern Android technologies, this project delivers an engaging NBA Manager simulation game that authentically captures the experience of leading a professional basketball team.

The project successfully implements MVVM architecture, local and cloud database storage, real-time game simulation, and an intuitive user interface using Jetpack Compose. While some features remain to be implemented (marketplace purchases, earnings system, season completion), the foundation is solid and extensible for future development.

---

