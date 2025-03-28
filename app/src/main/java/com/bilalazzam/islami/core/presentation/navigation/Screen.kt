package com.bilalazzam.islami.core.presentation.navigation

import androidx.annotation.StringRes
import com.bilalazzam.islami.R

sealed class Screen(val route: String, @StringRes val title: Int) {

    object HomeScreen: Screen("home_screen", R.string.home)
    object QuranScreen: Screen("quran_screen", R.string.quran)
    object TafseerScreen: Screen("tafseer_screen", R.string.tafseer)
    object HadithScreen: Screen("hadith_screen", R.string.hadith)
    object AzkarScreen: Screen("azkar_screen", R.string.azkar)
    object SalahTimesScreen: Screen("salah_times_screen", R.string.salah_times)
    object SettingsScreen: Screen("settings_screen", R.string.settings)
}