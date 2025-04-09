package com.bilalazzam.islami.features.quran_feature.presentation.quran

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R
import com.bilalazzam.islami.features.quran_feature.presentation.model.AyahTafseerUI
import com.bilalazzam.islami.features.quran_feature.presentation.model.AyahUI
import com.bilalazzam.islami.features.quran_feature.presentation.quran.components.Ayat
import com.bilalazzam.islami.features.quran_feature.presentation.quran.components.SorahHeader

@Composable
fun AyatScreen(
    ayahList: List<AyahUI> = listOf(),
    ayatTafseerList: List<AyahTafseerUI> = listOf(),
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Column (
            modifier = modifier
                .fillMaxSize()
                .align(Alignment.TopCenter),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            SorahHeader(
                sorahName = "الفاتحة",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            )
            Ayat(
                modifier = Modifier
                    .fillMaxWidth(),
                ayahsList = ayahList,
                ayahtTafseerList = ayatTafseerList
            )
        }
        Image(
            painter = painterResource(R.drawable.mosque_02),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            contentScale = ContentScale.FillWidth,
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary.copy(alpha = .2f))
        )
    }
}

