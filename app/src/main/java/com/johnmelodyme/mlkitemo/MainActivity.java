package com.johnmelodyme.mlkitemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.FirebaseApp;

/**
 * @Author: JOHN MELODY MELISSA
 * @Project: BLUETOOTH HC-05
 * @Inpired:  GF TAN SIN DEE <3
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(TAG, "MLKIT"+  "application started" );
        FirebaseApp.initializeApp(this);

    }
}
