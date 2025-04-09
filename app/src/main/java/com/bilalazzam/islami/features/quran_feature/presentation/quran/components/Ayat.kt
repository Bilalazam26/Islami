package com.bilalazzam.islami.features.quran_feature.presentation.quran.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.features.quran_feature.presentation.model.AyahTafseerUI
import com.bilalazzam.islami.features.quran_feature.presentation.model.AyahUI

@Composable
fun Ayat(
    ayahsList: List<AyahUI>,
    modifier: Modifier = Modifier,
    ayahtTafseerList: List<AyahTafseerUI>
) {
    var selected by remember {
        mutableIntStateOf(
            1
        )
    }
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (ayahsList.isEmpty()) {
            items(ayahtTafseerList) { ayahTafseerUI ->
                Ayah(
                    ayahUI = null,
                    ayahTafseerUI = ayahTafseerUI,
                    selected = ayahTafseerUI.ayah == selected
                ) { ayah ->
                    selected = ayah
                }
            }
        }
        items(ayahsList) { ayahUI ->
            Ayah(
                ayahUI = ayahUI,
                ayahTafseerUI = null,
                selected = selected == ayahUI.numberInSorah
            ) { ayah ->
                selected = ayah
            }
        }
    }
}