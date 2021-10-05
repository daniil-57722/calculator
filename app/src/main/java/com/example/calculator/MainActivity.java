package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText  editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sum(View v) {
        try{
        editText  = findViewById(R.id.firstSummandBtn);
        int first = Integer.parseInt(String.valueOf(editText.getText()));
        editText = findViewById(R.id.secondSummandBtn);
        int second = Integer.parseInt(String.valueOf(editText.getText()));

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("firstNum", first);
        intent.putExtra("secondNum", second);
        startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "Пожалуйста введите значение", Toast.LENGTH_LONG).show();
        }
    }
}