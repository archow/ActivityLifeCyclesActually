package com.example.activitylifecyclesactually;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.activitylifecyclesactually.model.User;

public class MainActivity extends AppCompatActivity {
    public static final String USER_OBJECT = "USER_OBJECT";
    private static final String COUNTER_VALUE = "COUNTER_VALUE";
    private static final String MAIN_ACTIVITY_LIFECYCLE = "MAIN_ACTIVITY_LIFECYCLE";
    private TextView mStartNextActivity;
    private Button mCounterBtn;
    private int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(MAIN_ACTIVITY_LIFECYCLE, "on create called for Main activity");
        value = 1;

        mCounterBtn = findViewById(R.id.counter_btn);

        mStartNextActivity = findViewById(R.id.start_next_activity);
        mStartNextActivity.setText(value + "");
        mStartNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Let's say I have a user object and I want to pass it to my intent
                User user = new User("Will", "Smith");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(USER_OBJECT, user);
                startActivity(intent);
            }
        });

        mCounterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value++;
                mStartNextActivity.setText(value + "");
            }
        });

        //restore data if bundle exists
        if (savedInstanceState != null) {
            value = savedInstanceState.getInt(COUNTER_VALUE);
            mStartNextActivity.setText(value + "");
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        //save data using the Bundle provided
        outState.putInt(COUNTER_VALUE, value);
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