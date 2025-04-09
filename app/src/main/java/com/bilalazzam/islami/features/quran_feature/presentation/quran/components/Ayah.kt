package com.bilalazzam.islami.features.quran_feature.presentation.quran.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.features.quran_feature.presentation.model.AyahTafseerUI
import com.bilalazzam.islami.features.quran_feature.presentation.model.AyahUI

@Composable
fun Ayah(
    ayahUI: AyahUI?,
    modifier: Modifier = Modifier,
    ayahTafseerUI: AyahTafseerUI?,
    selected: Boolean = false,
    onClick: (Int) -> Unit
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.primary.copy(alpha = .7f)),
        colors = if (selected) {
            CardDefaults.cardColors().copy(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.background
            )
        } else {
            CardDefaults.cardColors().copy(
                containerColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.primary
            )
        },
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                onClick(
                    (if (ayahUI == null) {
                        ayahTafseerUI?.ayah
                    } else {
                        ayahUI.numberInSorah
                    }) as Int
                )
            }
    ) {
        Text(
            text = if (ayahUI == null) {
                "[${ayahTafseerUI?.ayah}] ${ayahTafseerUI?.tafseer}"
            } else {
                "[${ayahUI.numberInSorah}] ${ayahUI.text}"
            },
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }
}