package com.example.newbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
MyReceiver br = new MyReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
     //   IntentFilter itt= ;
       IntentFilter itt2= new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        //dynamique
        registerReceiver(br,new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));
        registerReceiver(br,itt2);

    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(br);
        super.onDestroy();
    }
}