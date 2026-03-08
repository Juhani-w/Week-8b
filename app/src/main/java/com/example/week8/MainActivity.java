package com.example.week8;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText textInputNumber1;
    private EditText textInputNumber2;
    private TextView textOutput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textInputNumber1 = findViewById(R.id.inputNumber1); // Setting up the variables for input 1
        textInputNumber2 = findViewById(R.id.inputNumber2); // Setting up the variables for input 2
        textOutput = findViewById(R.id.textResult); // Setting up the variable for output

    }

    public void calculatePlus(View view) { // To calculate the sum of two numbers when sum button is clicked
        double number1 = Double.parseDouble(textInputNumber1.getText().toString());
        double number2 = Double.parseDouble(textInputNumber2.getText().toString());
        double result = number1 + number2;
        textOutput.setText(String.valueOf(result));

    }

    public void calculateMinus(View view) { // To calculate the difference of two numbers when difference button is clicked
        double number1 = Double.parseDouble(textInputNumber1.getText().toString());
        double number2 = Double.parseDouble(textInputNumber2.getText().toString());
        double result = number1 - number2;
        textOutput.setText(String.valueOf(result));

    }

    public void calculateMultiply(View view) { // To calculate the product of two numbers when product button is clicked
        double number1 = Double.parseDouble(textInputNumber1.getText().toString());
        double number2 = Double.parseDouble(textInputNumber2.getText().toString());
        double result = number1 * number2;
        textOutput.setText(String.valueOf(result));

    }

    public void calculateDivide(View view) { // To calculate the division of two numbers when dividend button is clicked
        double number1 = Double.parseDouble(textInputNumber1.getText().toString());
        double number2 = Double.parseDouble(textInputNumber2.getText().toString());
        double result = number1 / number2;
        textOutput.setText(String.valueOf(result));

    }


}