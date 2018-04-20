package com.example.ferdy.pindah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void kelayout2(View view) {
        Log.d(LOG_TAG,"Klicked");
        Intent intent = new Intent(this,layout2.class);
        startActivity(intent);
    }
}
