package com.bilalazzam.islami.core.presentation.navigation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.ui.theme.IslamiTheme
import com.bilalazzam.islami.R
import com.bilalazzam.islami.core.presentation.navigation.Screen

@Composable
fun NavigationComponent(
    modifier: Modifier = Modifier,
    onItemClick: (String) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavigationItem(
                modifier = Modifier.clickable {
                    onItemClick(Screen.QuranScreen.route)
                },
                iconPainter = painterResource(R.drawable.quran),
                text = R.string.quran
            )
            NavigationItem(
                modifier = Modifier.clickable {
                    onItemClick(Screen.TafseerScreen.route)
                },
                iconPainter = painterResource(R.drawable.tafseer),
                text = R.string.tafseer
            )
            NavigationItem(
                modifier = Modifier.clickable {
                    onItemClick(Screen.HadithScreen.route)
                },
                iconPainter = painterResource(R.drawable.hadith),
                text = R.string.hadith
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavigationItem(
                modifier = Modifier.clickable {
                    onItemClick(Screen.AzkarScreen.route)
                },
                iconPainter = painterResource(R.drawable.azkar),
                text = R.string.azkar
            )
            NavigationItem(
                modifier = Modifier.clickable {
                    onItemClick(Screen.SalahTimesScreen.route)
                },
                iconPainter = painterResource(R.drawable.time),
                text = R.string.salah_times
            )
            NavigationItem(
                modifier = Modifier.clickable {
                    onItemClick(Screen.SettingsScreen.route)
                },
                iconPainter = painterResource(R.drawable.settings),
                text = R.string.settings
            )
        }
    }

}
