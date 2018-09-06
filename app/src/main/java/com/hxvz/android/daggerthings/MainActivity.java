package com.hxvz.android.daggerthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnAddtion;
    private Button btnMultiplication;
    private Button btnSubtraction;

    private Addition addition = new Addition();
    private Subtraction subtraction = new Subtraction();
    private Multiplication multiplication = new Multiplication();
    private TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddtion = findViewById(R.id.btn_addition);
        btnMultiplication = findViewById(R.id.btn_multiplication);
        btnSubtraction = findViewById(R.id.btn_subtraction);
        screen = findViewById(R.id.txtViewScreen);

        btnAddtion.setOnClickListener(addition);
        btnSubtraction.setOnClickListener(subtraction);
        btnMultiplication.setOnClickListener(multiplication);
    }

    public void completed(String msg) {
        screen.setText(msg);
    }
}
