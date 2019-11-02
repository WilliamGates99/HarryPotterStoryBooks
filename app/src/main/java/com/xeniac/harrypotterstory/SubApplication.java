package com.xeniac.harrypotterstory;

import android.app.Application;
import android.os.Build;

import androidx.appcompat.app.AppCompatDelegate;

public class SubApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.getDefaultNightMode());
    }
}
