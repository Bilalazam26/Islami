package com.bilalazzam.islami.features.hadith_feature.components

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.core.presentation.navigation.Screen
import com.bilalazzam.islami.features.hadith_feature.model.HadithUI

@Composable
fun AhadithPager(
    ahadith: List<HadithUI>,
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    navigate: (String) -> Unit
) {
    HorizontalPager(
        state = pagerState,
        pageSpacing = 8.dp,
        contentPadding = PaddingValues(vertical = 16.dp),
        modifier = modifier
            .fillMaxWidth()
    ) { page ->
        Log.d("TAG", "AhadithPager: $page")
        HadithItem(
            hadithUI = ahadith[page],
            pagerState = pagerState,
            page = page,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .clickable {
                    navigate(Screen.HadithScreen.route)
                }
        )
    }

}

