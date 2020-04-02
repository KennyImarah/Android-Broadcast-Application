package com.example.broadcastapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //receiver object
    ConnectionReceiver receiver;
    //intentFilter object
    IntentFilter intentFilter;

    //override onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //call savedInstance on super
        super.onCreate(savedInstanceState);
        //setContentView to activity_main file
        setContentView(R.layout.activity_main);

        //create connectionReceiver
        receiver = new ConnectionReceiver();
        //create intentFilter on project folder
        intentFilter = new IntentFilter("com.example.broadcastapplication.SET_ACTION");
    }

    //override onResume
    @Override
    protected void onResume() {
        super.onResume();

        registerReceiver(receiver, intentFilter);
    }

    //override onDestroy
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    //onClick View function
    public void onClick(View view) {
        //Intent object on project folder
        Intent intent = new Intent("com.example.broadcastapplication.SOME_ACTION");
        //sendBroadcast on intent
        sendBroadcast(intent);
    }
}
