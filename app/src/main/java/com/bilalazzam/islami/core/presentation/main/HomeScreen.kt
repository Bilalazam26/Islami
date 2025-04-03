package com.bilalazzam.islami.core.presentation.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R
import com.bilalazzam.islami.core.presentation.navigation.components.NavigationComponent
import com.bilalazzam.islami.ui.theme.IslamiTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onNavItemClick: (String) -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(R.drawable.glow),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart),
            alignment = Alignment.TopEnd
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(R.drawable.mosque),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
            )
            HomeContent(
                modifier = Modifier.fillMaxSize()
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {

            Image(
                painter = painterResource(R.drawable.mosque_02),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp),
                contentScale = ContentScale.FillWidth,
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.surface)
            )
            NavigationComponent(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .clip(
                        shape = RoundedCornerShape(
                            topStart = 24.dp,
                            topEnd = 24.dp
                        )
                    )
                    .background(MaterialTheme.colorScheme.surface),
                onItemClick = onNavItemClick
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewNavigationComponent(modifier: Modifier = Modifier) {
    IslamiTheme {
        HomeScreen(modifier = modifier){}
    }
}