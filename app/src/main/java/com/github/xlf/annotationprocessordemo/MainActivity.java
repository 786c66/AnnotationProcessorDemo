package com.github.xlf.annotationprocessordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

@PrintMe
public class MainActivity extends AppCompatActivity {

    @PrintMe
    private static final String TAG = "MainActivity";

    @PrintMe
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
