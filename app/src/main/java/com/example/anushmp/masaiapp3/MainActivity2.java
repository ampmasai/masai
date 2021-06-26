package com.example.anushmp.masaiapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d("MainActivityLogs","Hello from the onCreate of Activity 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivityLogs","Hello from the onStart of Activity 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivityLogs","Hello from the onPause of Activity 2");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivityLogs", "Hello from the onResume of Activity 2");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivityLogs","Hello from the onStop of Activity 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivityLogs", "Hello from the onDestroy of Activity 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivityLogs", "Hello from the onRestart of Activity 2");
    }
}