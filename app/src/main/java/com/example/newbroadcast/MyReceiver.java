package com.example.newbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String intentAction = intent.getAction();
        switch (intentAction) {
            case Intent.ACTION_BATTERY_LOW:
               Log.i("aa", "batt low");
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Log.i("aa", "Mode av");
                break;

        }
    }

}