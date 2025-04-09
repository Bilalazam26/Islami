package com.bilalazzam.islami.features.quran_feature.presentation.quran.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.features.quran_feature.presentation.model.QuranIndexItemUI

@Composable
fun QuranIndex(
    quranIndexItemUIS: List<QuranIndexItemUI>,
    onItemClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn (
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(quranIndexItemUIS) { quranIndexItem ->
            QuranIndexItem(
                quranIndexItemUI = quranIndexItem,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onItemClick()
                    }
            )

            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                thickness = 1.dp,
                color = MaterialTheme.colorScheme.primary.copy(alpha = .8f)
            )
        }
    }
}