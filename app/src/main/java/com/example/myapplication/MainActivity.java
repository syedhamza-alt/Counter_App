package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtCount=findViewById(R.id.txt2);
        Button btnCount=findViewById(R.id.btnCounter);
        Button btnReset=findViewById(R.id.btnReset);
        AtomicInteger counter= new AtomicInteger();
        btnCount.setOnClickListener(view -> {
            counter.getAndIncrement();
            txtCount.setText(""+ counter);


        });

        btnReset.setOnClickListener(view -> {
            counter.set(0);
           txtCount.setText( ""+counter);
        });
    }
}