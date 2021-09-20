package com.example.activitylifecyclesactually;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    private static final String SECOND_ACTIVITY_LIFECYCLE = "SECOND_ACT_LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(SECOND_ACTIVITY_LIFECYCLE, "on create called for Second Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(SECOND_ACTIVITY_LIFECYCLE, "on restart called for Second Activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(SECOND_ACTIVITY_LIFECYCLE, "on start called for Second Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(SECOND_ACTIVITY_LIFECYCLE, "on pause called for Second Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(SECOND_ACTIVITY_LIFECYCLE, "on resume called for Second Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(SECOND_ACTIVITY_LIFECYCLE, "on stop called for Second Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(SECOND_ACTIVITY_LIFECYCLE, "on destroy called for Second Activity");
    }
}