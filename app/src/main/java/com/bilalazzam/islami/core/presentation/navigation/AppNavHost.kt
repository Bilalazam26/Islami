package com.bilalazzam.islami.core.presentation.navigation


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.createGraph
import com.bilalazzam.islami.auran.QuranScreen
import com.bilalazzam.islami.azkar.AzkarScreen
import com.bilalazzam.islami.hadith.HadithScreen
import com.bilalazzam.islami.home.HomeScreen
import com.bilalazzam.islami.salah_times.SalahTimesScreen
import com.bilalazzam.islami.settings.SettingsScreen
import com.bilalazzam.islami.tafseer.TafseerScreen


@Composable
fun AppUIHolder(
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
                ) { modifier ->
                    QuranScreen(
                        modifier = modifier
                    )
                }
            }
            composable(
                route = Screen.TafseerScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.TafseerScreen.title)
                ) { modifier ->
                    TafseerScreen(
                        modifier = modifier
                    )
                }
            }
            composable(
                route = Screen.HadithScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.HadithScreen.title)
                ) { modifier ->
                    HadithScreen(
                        modifier = modifier
                    )
                }
            }
            composable(
                route = Screen.AzkarScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.AzkarScreen.title)
                ) { modifier ->
                    AzkarScreen(
                        modifier = modifier
                    )
                }
            }
            composable(
                route = Screen.SalahTimesScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.SalahTimesScreen.title)
                ) { modifier ->
                    SalahTimesScreen(
                        modifier = modifier
                    )
                }
            }
            composable(
                route = Screen.SettingsScreen.route
            ) {
                NavScreen(
                    onBackClick = { navController.popBackStack() },
                    title = stringResource(Screen.SettingsScreen.title)
                ) { modifier ->
                    SettingsScreen(
                        modifier = modifier
                    )
                }
            }

        },
        modifier = modifier.fillMaxSize()
    )
}

