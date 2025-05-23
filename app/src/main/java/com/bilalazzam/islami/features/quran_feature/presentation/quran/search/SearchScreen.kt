package com.bilalazzam.islami.features.quran_feature.presentation.quran.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R
import com.bilalazzam.islami.core.presentation.components.IslamiTextField
import com.bilalazzam.islami.core.presentation.navigation.Screen


@Composable
fun SearchScreen(
    topPaddingValues: PaddingValues,
    modifier: Modifier = Modifier,
    quranOrTafseerOrHadith: String // to specify weather to navigate to ayat or tafseer
) {

    var searchKeyword by remember {
        mutableStateOf("")
    }

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
            Spacer(modifier = Modifier.padding(topPaddingValues))
            IslamiTextField(
                value = searchKeyword,
                onValueChange = {
                    searchKeyword = it
                    //implement search logic
                },
                icon = painterResource(R.drawable.book),
                hint = when(quranOrTafseerOrHadith) {
                    Screen.SearchAhadithScreen.route -> stringResource(R.string.search_for_hadith)
                    else -> stringResource(R.string.search_for_ayah)
                }
            )
        }




    }
}