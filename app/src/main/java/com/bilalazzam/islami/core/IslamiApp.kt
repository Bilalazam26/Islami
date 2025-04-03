package com.bilalazzam.islami.core

import android.app.Application
import android.content.Context
import com.bilalazzam.islami.core.presentation.main.settings.LocaleManager

class IslamiApp: Application() {

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(LocaleManager.setLocale(newBase))
    }
    override fun onCreate() {
        super.onCreate()
        LocaleManager.setLocale(this)
    }
}