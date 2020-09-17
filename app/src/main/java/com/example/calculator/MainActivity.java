package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMultiply,btnDivision, btnSubtraction, btnEqual, btnClear, btnDot, btnBracket;
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



    }
}