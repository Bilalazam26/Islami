package com.bilalazzam.islami.features.quran_feature.presentation.quran.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.LayoutDirection

@Composable
fun LocalizedImage(
    @DrawableRes image: Int,
    contentDescription: String?,
    alignment: Alignment,
    alignmentRTL: Alignment,
    colorFilter: ColorFilter,
    modifier: Modifier = Modifier
) {
    val isRTL = LocalLayoutDirection.current == LayoutDirection.Rtl
    Image(
        painter = painterResource(image),
        contentDescription = contentDescription,
        modifier = modifier
            .fillMaxWidth(),
        alignment = if (isRTL) alignmentRTL else alignment,
        colorFilter = colorFilter
    )

}