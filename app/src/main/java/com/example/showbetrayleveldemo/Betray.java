package com.example.showbetrayleveldemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class Betray extends BroadcastReceiver {

    private TextView tvShowBetrayLevel;

    public Betray(TextView tvShowBetrayLevel) {
        this.tvShowBetrayLevel = tvShowBetrayLevel;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        int level = intent.getIntExtra("level", 0);

        if (level != 0)
        {
            tvShowBetrayLevel.setText("Level of betray "+level);

        }

    }
}
