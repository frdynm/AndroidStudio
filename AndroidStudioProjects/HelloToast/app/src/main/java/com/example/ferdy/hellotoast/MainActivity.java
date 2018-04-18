package com.example.ferdy.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  int angka=0;
    private TextView tamangka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tamangka = (TextView) findViewById(R.id.angka);
    }

    public void tombol_hitung(View view) {
        angka++;
        if (tamangka != null)
            tamangka.setText(Integer.toString(angka));
    }

    public void tombol_kurang(View view) {
        angka --;
        if (tamangka != null)
            tamangka.setText(Integer.toString(angka));
    }
}
