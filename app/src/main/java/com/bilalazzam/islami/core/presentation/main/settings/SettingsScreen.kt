package com.bilalazzam.islami.core.presentation.main.settings

import android.app.Activity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bilalazzam.islami.R
import com.bilalazzam.islami.core.presentation.main.settings.components.LanguageSwitch
import java.nio.file.WatchEvent

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val activity = context as? Activity
    var languageState by remember {
        mutableStateOf(LocaleManager.getSavedLanguage(context))
    }
    val contentColor = MaterialTheme.colorScheme.primary

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center

        ) {
            Text(
                text = stringResource(R.string.change_app_language),
                style = MaterialTheme.typography.bodySmall,
                color = contentColor,
                textAlign = TextAlign.Start,
                modifier = Modifier.align(Alignment.CenterStart)
            )
            LanguageSwitch(
                color = contentColor,
                languageSwitch = { language ->
                    languageState = language
                    LocaleManager.saveLanguage(context, language)
                    activity?.let {
                        LocaleManager.restartApp(it)
                    }
                },
                languageState = languageState,
                modifier = Modifier.align(Alignment.CenterEnd)
            )
        }

        HorizontalDivider(
            thickness = 1.dp,
            color = contentColor.copy(alpha = .4f)
        )
    }

}