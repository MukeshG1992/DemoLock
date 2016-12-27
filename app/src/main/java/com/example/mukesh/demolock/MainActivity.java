package com.example.mukesh.demolock;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(MainActivity.this,Main.class));
        TextView text = (TextView) findViewById(R.id.textView1);
        text.setText("First Page");
        Intent intent = new Intent(this, NextActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 12345, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager am = (AlarmManager) getSystemService(Activity.ALARM_SERVICE);
        am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),pendingIntent);


        //  finish();

        //am.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(),1000 * 15, pendingIntent);
    }

}

