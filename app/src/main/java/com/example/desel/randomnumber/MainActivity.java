package com.example.desel.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText etMin;
    EditText etMax;

    TextView tvOutput;


    Button btnGenerate;

    Random r;
    int min;
    int max;
    int output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        etMin = findViewById(R.id.etMin);
        etMax = findViewById(R.id.etMax);
        tvOutput = findViewById(R.id.tvOutput);
        btnGenerate = findViewById(R.id.btnGenerate);

        min = Integer.parseInt(etMin.getText().toString());
        max = Integer.parseInt(etMax.getText().toString());

        output = r.nextInt((max - min) + 1) + min;

        tvOutput.setText("" + output);
    }

    public  void Generate(View view)
    {
//        min = Integer.parseInt(etMin.getText().toString());
//        max = Integer.parseInt(etMax.getText().toString());
//
//        output = r.nextInt((max - min) + 1) + min;
//
//        tvOutput.setText("" + output);
    }
}
