package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstText = (EditText)findViewById(R.id.firstNumber);
        final EditText secondText = (EditText)findViewById(R.id.secondNumber);
        final TextView resultText = (TextView)findViewById(R.id.resultText);

        Button plusButton = (Button)findViewById(R.id.plusButton);
        Button minusButton = (Button)findViewById(R.id.minusButton);
        Button timesButton = (Button)findViewById(R.id.timesButton);
        Button dividButton = (Button)findViewById(R.id.dividButton);

//        final String num1Str = firstText.getText().toString();// I am sure it contain a numer
//        final String num2Str = secondText.getText().toString();
//
//
//        final int num1 = Integer.parseInt(num1Str);
//        final int num2 = Integer.parseInt(num2Str);


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String num1Str = firstText.getText().toString();// I am sure it contain a numer
                 String num2Str = secondText.getText().toString();

                 int num1 = Integer.parseInt(num1Str);
                 int num2 = Integer.parseInt(num2Str);

                resultText.setText(String.valueOf(num1 + num2));

            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = firstText.getText().toString();// I am sure it contain a numer
                String num2Str = secondText.getText().toString();

                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);

                resultText.setText(String.valueOf(num1 - num2));

            }
        });


        timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1Str = firstText.getText().toString();// I am sure it contain a numer
                String num2Str = secondText.getText().toString();

                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);

                resultText.setText(String.valueOf(num1 * num2));

            }
        });

        dividButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = firstText.getText().toString();// I am sure it contain a numer
                String num2Str = secondText.getText().toString();

                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);

                resultText.setText(String.valueOf(num1 / num2));

            }
        });
    }
}
