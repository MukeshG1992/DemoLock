package com.example.mukesh.demolock;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class  Main extends Service {
    public Main() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        BroadcastReceiver mReceiver = new MyReceiver();
        registerReceiver(mReceiver, filter);


    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
     /*   boolean screenOn = intent.getBooleanExtra("screen_state", false);
        if (!screenOn) {
            // your code
            Toast.makeText(getApplicationContext(),"Screen on",Toast.LENGTH_SHORT).show();
        } else {
            // your code
            Toast.makeText(getApplicationContext(),"Screen off",Toast.LENGTH_SHORT).show();
        }*/

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
        Log.i("Service", "onStartCommand: ");
        System.exit(1);


        return super.onStartCommand(intent, flags, startId);
    }
}
