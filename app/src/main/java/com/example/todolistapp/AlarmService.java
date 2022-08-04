package com.example.todolistapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class AlarmService extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

     NotificationCompat.Builder builder = new NotificationCompat.Builder(context ,MainActivity.ChannelID).
                setContentTitle("manager").setContentText("hello").setAutoCancel(true).setPriority(NotificationCompat.PRIORITY_HIGH)
             .setDefaults(NotificationCompat.DEFAULT_ALL).setSmallIcon(R.drawable.ic_baseline_delete_24);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
        notificationManagerCompat.notify(123,builder.build());

        MediaPlayer mp = MediaPlayer.create(context , R.raw.bob_marley_three_little_birds_with_lyrics_mp3_52592);
        mp.start();
    }
}