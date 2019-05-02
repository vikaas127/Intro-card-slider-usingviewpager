package com.example.dell.jyangani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.ProgressBar;

public class Splash extends Activity {
    Handler handler;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ProgressBar prs =(ProgressBar)findViewById(R.id.progressBar3);

        new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

            @Override

            public void run() {

                Intent i = new Intent(Splash.this,com.example.dell.jyangani.MainActivity.class);

                startActivity(i);

                // close this activity

                finish();

            }

        }, 2*1000); // wait for 5 seconds

    }
}
