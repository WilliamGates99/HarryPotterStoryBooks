package com.xeniac.harrypotterstory;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import androidx.appcompat.app.AppCompatDelegate;

import java.util.Locale;

public class SubApplication extends Application {

    private SharedPreferences settingsPrefs;

    @Override
    public void onCreate() {
        super.onCreate();
        setNightMode();
        setLocale();
    }

    private void setNightMode() {
        settingsPrefs = getSharedPreferences(Constants.PREFERENCE_SETTINGS, MODE_PRIVATE);
        boolean nightMode = settingsPrefs.getBoolean(Constants.PREFERENCE_NIGHT_MODE_KEY, false);

        if (nightMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }

    private void setLocale() {
        settingsPrefs = getSharedPreferences(Constants.PREFERENCE_SETTINGS, MODE_PRIVATE);
        String language = settingsPrefs.getString(Constants.PREFERENCE_LANGUAGE_KEY, "en");
        String country = settingsPrefs.getString(Constants.PREFERENCE_COUNTRY_KEY, "US");

        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale newLocale = new Locale(language, country);
        Locale.setDefault(newLocale);
        configuration.setLocale(newLocale);
        resources.updateConfiguration(configuration, displayMetrics);
    }
}