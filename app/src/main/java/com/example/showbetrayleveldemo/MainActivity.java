package com.example.showbetrayleveldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvShowBetrayLevel;
    private Betray betray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShowBetrayLevel = findViewById(R.id.tvShowBetrayLevel);

        betray = new Betray(tvShowBetrayLevel);

        registerReceiver(betray, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));


    }

    @Override
    protected void onStop() {
        super.onStop();

        unregisterReceiver(betray);
    }
}