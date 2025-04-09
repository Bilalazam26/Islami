package com.bilalazzam.islami.features.quran_feature.presentation.quran.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.features.quran_feature.presentation.model.AyahUI

@Composable
fun Ayat(
    ayahsList: List<AyahUI>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(ayahsList) { ayahUI ->
            Ayah(
                ayahUI = ayahUI
            )
        }
    }
}