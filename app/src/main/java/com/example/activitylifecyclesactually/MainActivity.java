package com.example.activitylifecyclesactually;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String MAIN_ACTIVITY_LIFECYCLE = "MAIN_ACTIVITY_LIFECYCLE";
    private TextView mStartNextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(MAIN_ACTIVITY_LIFECYCLE, "on create called for Main activity");

        mStartNextActivity = findViewById(R.id.start_next_activity);
        mStartNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(MAIN_ACTIVITY_LIFECYCLE, "on restart called for Main Activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(MAIN_ACTIVITY_LIFECYCLE, "on start called for Main Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MAIN_ACTIVITY_LIFECYCLE, "on pause called for Main Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(MAIN_ACTIVITY_LIFECYCLE, "on resume called for Main Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(MAIN_ACTIVITY_LIFECYCLE, "on stop called for Main Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(MAIN_ACTIVITY_LIFECYCLE, "on destroy called for Main Activity");
    }
}