package com.sample.recognizefdl;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent() != null && Utility.isFdl(this, getIntent().getDataString())) {
            // Intent data is FDL
            // so get the data from FDL

        } else {
            // not a FDL

        }
    }
}