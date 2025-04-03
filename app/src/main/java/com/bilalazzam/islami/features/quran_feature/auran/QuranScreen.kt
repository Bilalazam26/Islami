package com.bilalazzam.islami.features.quran_feature.auran

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R

@Composable
fun QuranScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.mask_start),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart),
            alignment = Alignment.TopStart,
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary.copy(alpha = .5f))
        )

        Image(
            painter = painterResource(R.drawable.mask_end),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopEnd),
            alignment = Alignment.TopEnd,
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary.copy(alpha = .5f))
        )
        QuranScreenContent()
    }
}

@Composable
fun QuranScreenContent() {

}