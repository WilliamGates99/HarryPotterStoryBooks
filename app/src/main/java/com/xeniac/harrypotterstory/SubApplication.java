package com.xeniac.harrypotterstory;

import android.app.Application;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

public class SubApplication extends Application {

    public static final String DARK_MODE_CHECK = "dark_mode_check";
    public static final String DARK_MODE_CHECK_KEY = "dark_mode_check_key";

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPreferences preferences = getSharedPreferences(DARK_MODE_CHECK, MODE_PRIVATE);
        boolean darkMode = preferences.getBoolean(DARK_MODE_CHECK_KEY, false);

        if (darkMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
