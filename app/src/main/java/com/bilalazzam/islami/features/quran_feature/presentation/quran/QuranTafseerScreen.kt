package com.bilalazzam.islami.features.quran_feature.presentation.quran


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R
import com.bilalazzam.islami.core.presentation.navigation.Screen
import com.bilalazzam.islami.dumy.quranIndecies
import com.bilalazzam.islami.core.presentation.components.IslamiTextField

@Composable
fun QuranTafseerScreen(
    quranOrTafseer: String,
    topPaddingValues: PaddingValues,
    modifier: Modifier = Modifier,
    navigate: (String) -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.mosque_background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background.copy(alpha = .94f))
                .padding(horizontal = 16.dp)
        ) {
            QuranScreenHeader(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                topPaddingValues = topPaddingValues
            )
            //search bar component
            IslamiTextField(
                modifier = Modifier.clickable {
                    navigate(Screen.SearchAyatScreen.route)
                },
                onValueChange = {},
                icon = painterResource(R.drawable.book),
                enabled = false
            )
            //pager for suras list and pager

            Text(
                text = stringResource(R.string.suras_list),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(8.dp))

            QuranIndex(
                quranIndexItemUIS = quranIndecies,
                onItemClick = {
                    navigate(
                        if (quranOrTafseer == Screen.QuranScreen.route)
                            Screen.AyatScreen.route
                        else
                            Screen.AyatTafseerScreen.route
                    )
                }
            )

        }

    }

}

