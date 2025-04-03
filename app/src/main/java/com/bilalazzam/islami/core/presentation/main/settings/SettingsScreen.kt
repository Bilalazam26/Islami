package com.bilalazzam.islami.core.presentation.main.settings

import android.app.Activity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.bilalazzam.islami.core.presentation.main.settings.components.LanguageSwitch

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val activity = context as? Activity
    var languageState by remember {
        mutableStateOf(LocaleManager.getSavedLanguage(context))
    }

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        LanguageSwitch(
            color = MaterialTheme.colorScheme.primary,
            languageSwitch = { language ->
                languageState = language
                LocaleManager.saveLanguage(context, language)
                activity?.let {
                    LocaleManager.restartApp(it)
                }
            },
            languageState = languageState
        )
    }

}