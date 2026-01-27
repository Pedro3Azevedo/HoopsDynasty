package com.dam.hoopsdynasty.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainViewModel(application: Application) : AndroidViewModel(application) {

    // Defer construction of child ViewModels until first access
    val managerViewModel: ManagerViewModel by lazy { ManagerViewModel(getApplication()) }
    val playerViewModel: PlayerViewModel by lazy { PlayerViewModel(getApplication()) }
    val gameViewModel: GameViewModel by lazy { GameViewModel(getApplication()) }
    val teamViewModel: TeamViewModel by lazy { TeamViewModel(getApplication()) }
    val seasonViewModel: SeasonViewModel by lazy { SeasonViewModel(getApplication()) }
    val gamesSimulationViewModel: GamesSimulationViewModel by lazy { GamesSimulationViewModel(getApplication()) }

}
