package com.bilalazzam.islami.features.hadith_feature

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R
import com.bilalazzam.islami.core.presentation.components.IslamiScreenHeader
import com.bilalazzam.islami.core.presentation.components.IslamiTextField
import com.bilalazzam.islami.core.presentation.navigation.Screen
import com.bilalazzam.islami.dumy.ahadith
import com.bilalazzam.islami.features.hadith_feature.components.AhadithPager

@Composable
fun AhadithScreen(
    modifier: Modifier = Modifier,
    topPaddingValues: PaddingValues,
    navigate: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.mosque_02_background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background.copy(alpha = .94f)),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            IslamiScreenHeader(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                topPaddingValues = topPaddingValues
            )
            //search bar component
            IslamiTextField(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .clickable {
                    navigate(Screen.SearchAhadithScreen.route)
                },
                onValueChange = {},
                icon = painterResource(R.drawable.book),
                enabled = false,
                hint = stringResource(R.string.search_for_hadith)
            )
            //AHadithPager
            var ahadithPagerState = rememberPagerState(pageCount = {ahadith.size})
            AhadithPager(
                ahadith = ahadith,
                pagerState = ahadithPagerState
            ) { route ->
                navigate(route)
            }
        }

    }
}