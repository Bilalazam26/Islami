package com.bilalazzam.islami.core.presentation.main.settings

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.LocaleList
import java.util.Locale
import androidx.core.content.edit

object LocaleManager {
    fun setLocale(
        context: Context?
    ): Context? {
        val language = getSavedLanguage(context)

        return updateResources(context, language)
    }

    private fun updateResources(
        context: Context?,
        language: String
    ): Context? {
        val locale = Locale(language)
        Locale.setDefault(locale)

        val config = Configuration(context?.resources?.configuration)
        config.setLocale(locale)
        config.setLocales(LocaleList(locale))

        return context?.createConfigurationContext(config)
    }

    fun restartApp(activity: Activity) {
        val intent = Intent(activity, activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        activity.finish()
        activity.startActivity(intent)
    }

    fun getSavedLanguage(context: Context?): String {
        return context?.getSharedPreferences("settings", Context.MODE_PRIVATE)
            ?.getString("language", Locale.getDefault().language) ?: "en"
    }

    fun saveLanguage(context: Context, language: String) {
        context.getSharedPreferences("settings", Context.MODE_PRIVATE)
            .edit() {
                putString("language", language)
            }
    }
}