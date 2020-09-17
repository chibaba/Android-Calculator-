package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMultiply,btnDivision, btnPercentage, btnSubtraction, btnEqual, btnClear, btnDot, btnBracket;
    TextView tvInput, tvOutput;
    String process;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnBracket= findViewById(R.id.btnBracket);
        btnClear= findViewById(R.id.btnClear);
        btnDivision= findViewById(R.id.btnDivision);
        btnDot = findViewById(R.id.btnDot);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnPlus = findViewById(R.id.btnPlus);
        btnEqual = findViewById(R.id.btnPlus);
        btnPercentage = findViewById(R.id.btnPercentage);

        tvInput = findViewById(R.id.tvInput);
        tvOutput= findViewById(R.id.tvOutput);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
            }

        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + 1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + 1);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "5");
            }
        });



    }



}