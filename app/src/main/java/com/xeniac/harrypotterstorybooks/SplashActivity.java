package com.xeniac.harrypotterstorybooks;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashAction();
    }

    private void splashAction() {
        startActivity(new Intent(this, BooksActivity.class));
        finish();
    }
}