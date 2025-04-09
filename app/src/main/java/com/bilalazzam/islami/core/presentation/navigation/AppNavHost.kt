package com.bilalazzam.islami.core.presentation.navigation


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.createGraph
import com.bilalazzam.islami.features.quran_feature.presentation.quran.QuranTafseerScreen
import com.bilalazzam.islami.features.azkar_feature.AzkarScreen
import com.bilalazzam.islami.features.hadith_feature.HadithScreen
import com.bilalazzam.islami.core.presentation.main.HomeScreen
import com.bilalazzam.islami.features.salah_times.SalahTimesScreen
import com.bilalazzam.islami.core.presentation.main.settings.SettingsScreen
import com.bilalazzam.islami.dumy.ayahsList
import com.bilalazzam.islami.dumy.ayatTafseerList
import com.bilalazzam.islami.features.quran_feature.presentation.quran.AyatScreen
import com.bilalazzam.islami.features.quran_feature.presentation.quran.search.SearchScreen


@Composable
fun IslamiAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        graph = navController.createGraph(
            startDestination = Screen.HomeScreen.route
        ) {
            composable(
                route = Screen.HomeScreen.route
            ) {
                HomeScreen(
                    modifier = Modifier.fillMaxSize(),
                    onNavItemClick = { route ->
                        navController.navigate(route)
                    }
                )
            }
            composable(
                route = Screen.QuranScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.QuranScreen.title)
                ) { modifier, topPaddingValues ->
                    QuranTafseerScreen(
                        modifier = modifier,
                        topPaddingValues = topPaddingValues,
                        quranOrTafseer = Screen.QuranScreen.route
                    ) {
                        navController.navigate(it)
                    }
                }
            }

            composable(
                route = Screen.AyatScreen.route
            ) {
                AyatScreen(
                    ayahList = ayahsList,
                    modifier = Modifier.fillMaxSize()
                )
            }

            composable(
                route = Screen.SearchAyatScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.SearchAyatScreen.title)
                ) { modifier, topPaddingValues  ->
                    SearchScreen(
                        modifier = modifier,
                        topPaddingValues = topPaddingValues,
                        quranOrTafseer = Screen.SearchAyatTafseerScreen.route
                    )
                }
            }

            composable(
                route = Screen.TafseerScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.QuranScreen.title)
                ) { modifier, topPaddingValues ->
                    QuranTafseerScreen(
                        modifier = modifier,
                        topPaddingValues = topPaddingValues,
                        quranOrTafseer = Screen.TafseerScreen.route
                    ) {
                        navController.navigate(it)
                    }
                }
            }

            composable(
                route = Screen.AyatTafseerScreen.route
            ) {
                AyatScreen(
                    ayatTafseerList = ayatTafseerList,
                    modifier = Modifier.fillMaxSize()
                )
            }

            composable(
                route = Screen.SearchAyatTafseerScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.SearchAyatScreen.title)
                ) { modifier, topPaddingValues  ->
                    SearchScreen(
                        modifier = modifier,
                        topPaddingValues = topPaddingValues,
                        quranOrTafseer = Screen.SearchAyatTafseerScreen.route
                    )
                }
            }

            composable(
                route = Screen.HadithScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.HadithScreen.title)
                ) { modifier, topPaddingValues ->
                    HadithScreen(
                        modifier = modifier.padding(topPaddingValues)
                    )
                }
            }
            composable(
                route = Screen.AzkarScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.AzkarScreen.title)
                ) { modifier, topPaddingValues  ->
                    AzkarScreen(
                        modifier = modifier.padding(topPaddingValues)
                    )
                }
            }
            composable(
                route = Screen.SalahTimesScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.SalahTimesScreen.title)
                ) { modifier, topPaddingValues  ->
                    SalahTimesScreen(
                        modifier = modifier.padding(topPaddingValues)
                    )
                }
            }
            composable(
                route = Screen.SettingsScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.SettingsScreen.title)
                ) { modifier, topPaddingValues  ->
                    SettingsScreen(
                        modifier = modifier.padding(topPaddingValues)
                    )
                }
            }

        },
        modifier = modifier.fillMaxSize()
    )
}

