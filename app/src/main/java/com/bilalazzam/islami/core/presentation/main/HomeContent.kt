package com.bilalazzam.islami.core.presentation.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R
import com.bilalazzam.islami.ui.theme.IslamiTheme

@Composable
fun HomeContent(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Text(
            text = stringResource(R.string.salam_alaykom),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.displayLarge,
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "الثلاثاء 28, مارس 2025",
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            text = "28, رمضان 1446",
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.headlineLarge
        )
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewHomeContent(modifier: Modifier = Modifier) {
    IslamiTheme {
        HomeContent(modifier = modifier)
    }
}