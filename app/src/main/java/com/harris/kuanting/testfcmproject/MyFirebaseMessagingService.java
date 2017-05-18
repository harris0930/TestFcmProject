package com.harris.kuanting.testfcmproject;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by kuanting on 2017/4/19.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d("FCM", "onMessageReceived:"+remoteMessage.getNotification());
        Log.d("FCM", "onMessageReceived:"+remoteMessage.getMessageId());
        Log.d("FCM", "onMessageReceived:"+remoteMessage.getData());
    }
}

