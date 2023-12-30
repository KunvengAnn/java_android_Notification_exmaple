package com.example.notification_android;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_notification = findViewById(R.id.notification_button);
        btn_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showNotification();
            }
        });
    }

    private void showNotification() {
        // Log a message to check if the method is being called
        Log.d("Notification", "message Notification");
        // Call the method to create a notification
        NotificationHelper.createNotification(MainActivity.this, "Notification", "This is a notification message.");
    }

}
