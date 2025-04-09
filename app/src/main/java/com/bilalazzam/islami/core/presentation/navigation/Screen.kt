package com.bilalazzam.islami.core.presentation.navigation

import androidx.annotation.StringRes
import com.bilalazzam.islami.R

sealed class Screen(val route: String, @StringRes val title: Int) {

    object HomeScreen: Screen("home_screen", R.string.home)

    object QuranScreen: Screen("quran_screen", R.string.quran)
    object AyatScreen: Screen("sorah_screen", R.string.empty)
    object SearchAyatScreen: Screen("search_screen", R.string.search)

    object TafseerScreen: Screen("tafseer_screen", R.string.tafseer)
    object AyatTafseerScreen: Screen("ayat_tafseer_screen", R.string.tafseer)
    object SearchAyatTafseerScreen: Screen("search_ayat_tafseer_screen", R.string.search)

    object AHadithScreen: Screen("ahadith_screen", R.string.hadith)
    object HadithScreen: Screen("hadith_screen", R.string.hadith)
    object SearchAhadithScreen: Screen("search_ahadith_screen", R.string.search)

    object AzkarScreen: Screen("azkar_screen", R.string.azkar)
    object SalahTimesScreen: Screen("salah_times_screen", R.string.salah_times)
    object SettingsScreen: Screen("settings_screen", R.string.settings)
}