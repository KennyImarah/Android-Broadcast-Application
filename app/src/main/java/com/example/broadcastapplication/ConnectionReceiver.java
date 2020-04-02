package com.example.broadcastapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

//connection receiver class
public class ConnectionReceiver extends BroadcastReceiver {

    //onReceive function with Intent and Context arguments
    public void onReceive(Context context, Intent intent){
        Log.w("ConnectionReceiver", "" + intent.getAction());
        if (intent.getAction().equals("com.example.broadcastapplication.SOME_ACTION")) {

            Toast.makeText(context, "Action:" + intent.getAction(), Toast.LENGTH_SHORT).show();
        }
    }
}
