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
import com.bilalazzam.islami.features.quran_feature.presentation.quran.QuranScreen
import com.bilalazzam.islami.features.azkar_feature.AzkarScreen
import com.bilalazzam.islami.features.hadith_feature.HadithScreen
import com.bilalazzam.islami.core.presentation.main.HomeScreen
import com.bilalazzam.islami.features.salah_times.SalahTimesScreen
import com.bilalazzam.islami.core.presentation.main.settings.SettingsScreen
import com.bilalazzam.islami.features.quran_feature.presentation.quran.SorahScreen
import com.bilalazzam.islami.features.quran_feature.presentation.quran.search.SearchScreen
import com.bilalazzam.islami.features.quran_feature.presentation.tafseer.TafseerScreen


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
                    QuranScreen(
                        modifier = modifier,
                        topPaddingValues = topPaddingValues,
                        navigate = {
                            navController.navigate(it)
                        }
                    )
                }
            }
            composable(
                route = Screen.TafseerScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.TafseerScreen.title)
                ) { modifier, topPaddingValues  ->
                    TafseerScreen(
                        modifier = modifier.padding(topPaddingValues)
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

            composable(
                route = Screen.SearchScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.SearchScreen.title)
                ) { modifier, topPaddingValues  ->
                    SearchScreen(
                        modifier = modifier,
                        topPaddingValues = topPaddingValues
                    )
                }
            }

            composable(
                route = Screen.SorahScreen.route
            ) {
                SorahScreen(
                    modifier = Modifier.fillMaxSize()
                )
            }

        },
        modifier = modifier.fillMaxSize()
    )
}

