package com.bilalazzam.islami.features.quran_feature.presentation.quran.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R

@Composable
fun NumberComponent(
    number: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.number_container),
            contentDescription = null,
            modifier = Modifier
                .sizeIn(
                    minWidth = 36.dp,
                    minHeight = 36.dp,
                    maxWidth = 48.dp,
                    maxHeight = 48.dp
                ).align(Alignment.Center),
            tint = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "$number",
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.labelLarge
        )
    }
}