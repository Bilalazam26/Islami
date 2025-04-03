package com.bilalazzam.islami.core.presentation.main

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.rememberNavController
import com.bilalazzam.islami.core.presentation.main.settings.LocaleManager
import com.bilalazzam.islami.core.presentation.navigation.AppUIHolder
import com.bilalazzam.islami.ui.theme.IslamiTheme

class MainActivity : ComponentActivity() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(LocaleManager.setLocale(newBase))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        actionBar?.hide()
        setContent {
            IslamiTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.Companion.fillMaxSize()) { innerPadding ->
                    AppUIHolder(
                        modifier = Modifier.Companion
                            .fillMaxSize()
                            .padding(innerPadding),
                        navController = navController
                    )
                }
            }
        }
    }
}