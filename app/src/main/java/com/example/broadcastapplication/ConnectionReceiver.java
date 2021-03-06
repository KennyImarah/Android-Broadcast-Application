package com.example.broadcastapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

//connection receiver class
public class ConnectionReceiver extends BroadcastReceiver {

    //onReceive method with Intent and Context arguments
    public void onReceive(Context context, Intent intent){
        Log.w("ConnectionReceiver", "" + intent.getAction());  // log warning
        if (intent.getAction().equals("com.example.broadcastapplication.SOME_ACTION")) {   //check intent status

            Toast.makeText(context, "Action:" + intent.getAction(), Toast.LENGTH_SHORT).show();  // make toast
        }
    }
}
