package com.bilalazzam.islami.features.quran_feature.presentation.quran.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R

@Composable
fun SorahHadithHeader(
    text: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painter = painterResource(R.drawable.mask_end),
            contentDescription = null,
            modifier = Modifier
                .size(
                    96.dp
                )
                .align(Alignment.CenterStart),
            contentScale = ContentScale.FillBounds,
            colorFilter = ColorFilter.tint(color.copy(alpha = .8f))
        )
        Text(
            text = text,
            style = MaterialTheme.typography.titleLarge,
            color = color,
            modifier = Modifier.align(Alignment.Center)
        )
        Image(
            painter = painterResource(R.drawable.mask_start),
            contentDescription = null,
            modifier = Modifier
                .size(
                    96.dp
                )
                .align(Alignment.CenterEnd),
            contentScale = ContentScale.FillBounds,
            colorFilter = ColorFilter.tint(color.copy(alpha = .8f))
        )
    }

}