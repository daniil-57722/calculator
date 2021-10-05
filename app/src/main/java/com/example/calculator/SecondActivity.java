package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.resView);
        Bundle arguments = getIntent().getExtras();

        int firstSummand = arguments.getInt("firstNum");
        int secondSummand = arguments.getInt("secondNum");
        int result = firstSummand + secondSummand;
        if (secondSummand<0){
            String secondSummandOutput = "("+secondSummand+")";
            textView.setText(""+firstSummand+"+"+secondSummandOutput+"="+result);
        }
        else {
            textView.setText(""+firstSummand+"+"+secondSummand+"="+result);
        }

    }
}
