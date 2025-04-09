package com.bilalazzam.islami.core.presentation.main.settings.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R
import com.bilalazzam.islami.ui.theme.IslamiTheme

@Composable
fun LanguageSwitch(
    modifier: Modifier = Modifier,
    color: Color,
    languageSwitch: (String) -> Unit,
    languageState: String
) {
    Card(
        modifier = modifier
            .wrapContentSize(unbounded = true),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(
            width = 2.dp,
            color = color
        ),
        colors = CardDefaults.cardColors().copy(
            containerColor = MaterialTheme.colorScheme.background
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(if (languageState == "ar") {
                        color
                    } else {
                        MaterialTheme.colorScheme.background
                    })
                    .clickable {
                        languageSwitch("ar")
                    }
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.ye),
                    contentDescription = stringResource(R.string.arabic_language),
                    modifier = Modifier
                        .size(36.dp)
                        .align(Alignment.CenterStart),
                    alignment = Alignment.CenterStart
                )
            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(if (languageState == "en") {
                        color
                    } else {
                        MaterialTheme.colorScheme.background
                    })
                    .clickable {
                        languageSwitch("en")
                    }
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.us),
                    contentDescription = stringResource(R.string.english_language),
                    modifier = Modifier
                        .size(36.dp)
                        .align(Alignment.CenterEnd),
                    alignment = Alignment.CenterEnd
                )
            }
        }
    }

}