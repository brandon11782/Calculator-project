package com.csci490bn.calculator_bneese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calcText;
    float answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcText = findViewById(R.id.calcText);
    }

    public void Clear(View v){
        calcText.setText(calcText.getText().subSequence(0, calcText.getText().length() - 1));
    }

    public void ClearEverything(View v){
        calcText.setText("");
    }

    public void Add(View v){
        if (calcText.getText().length() != 0)
            calcText.append(getResources().getString(R.string.add));
    }

    public void Subtract(View v){
        if (calcText.getText().length() != 0)
            calcText.append(getResources().getString(R.string.subtract));
    }

    public void Multiply(View v){
        if (calcText.getText().length() != 0)
            calcText.append(getResources().getString(R.string.multiply));
    }

    public void Divide(View v){
        if (calcText.getText().length() != 0)
            calcText.append(getResources().getString(R.string.divide);
    }

    public void Equals(View v){
        char [] equation = calcText.getText().toString().toCharArray();
        answer = Equals(equation);

        calcText.setText(String.valueOf(answer));
    }

    public void DecimalInput(View v){
        calcText.append(getResources().getString(R.string.point));
    }

    public void OneInput(View v){
        calcText.append(getResources().getString(R.string.one));
    }

    public void TwoInput(View v){
        calcText.append(getResources().getString(R.string.two));
    }

    public void ThreeInput(View v){
        calcText.append(getResources().getString(R.string.three));
    }

    public void FourInput(View v){
        calcText.append(getResources().getString(R.string.four));
    }

    public void FiveInput(View v){
        calcText.append(getResources().getString(R.string.five));
    }

    public void SixInput(View v){
        calcText.append(getResources().getString(R.string.six));
    }

    public void SevenInput(View v){
        calcText.append(getResources().getString(R.string.seven));
    }

    public void EightInput(View v){
        calcText.append(getResources().getString(R.string.eight));
    }

    public void NineInput(View v){
        calcText.append(getResources().getString(R.string.nine));
    }

    public void ZeroInput(View v){
        calcText.append(getResources().getString(R.string.zero));
    }


    public float Equals(char[] equation) {

    }

