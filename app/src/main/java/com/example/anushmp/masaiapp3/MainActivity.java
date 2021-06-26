package com.example.anushmp.masaiapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String tag = "MainActivityLogs";
    private Button btnSecondActivityLauncher;
    private Button toast1;
    private Button toast2;
    private Button toast3;

    //This is an update.
    //This is the second update.
    //this

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag,"Hello from onCreate of Activity 1!");

        btnSecondActivityLauncher = findViewById(R.id.btnLaunchSecondActivity);

        btnSecondActivityLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //code to open second activity

                Toast.makeText(MainActivity.this, "Wow, you clicked the button, Great job!", Toast.LENGTH_SHORT).show();

                Intent takeMeTo2ndActivity = new Intent(MainActivity.this, MainActivity2.class);

                startActivity(takeMeTo2ndActivity);



            }
        });

        toast1 = findViewById(R.id.toastButton1);

        toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Hello from Toast 1", Toast.LENGTH_LONG).show();
                Log.d("MainActivityLogs","Toast 1 tapped");

            }
        });

        toast2 = findViewById(R.id.toastButton2);

        toast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello from Toast 2", Toast.LENGTH_LONG).show();
                Log.d("MainActivityLogs","Toast 2 tapped");
            }
        });

        toast3 = findViewById(R.id.toastButton3);
        toast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello from Toast 3", Toast.LENGTH_LONG).show();
                Log.d("MainActivityLogs","Toast 3 tapped");
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"Hello from onStart of Activity 1!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "Hello from onPause of Activity 1!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"Hello from onRestart of Activity 1!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"Hello from onResume of Activity 1!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "Hello from onStop of Activity 1!");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "Hello from onDestroy of Activity 1!");
    }



}