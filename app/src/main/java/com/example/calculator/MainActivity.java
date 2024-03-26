package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private TextView mainText;
    private TextView supportingText;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    String mainString = "";
    String supportingString = "";
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

        mainText = findViewById(R.id.main_text);
        supportingText = findViewById(R.id.supporting_text);
        button_0 = (Button) findViewById(R.id.button_0);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
    }


    public void buttonNumber(View v){
        int viewId = v.getId();
        if(viewId == R.id.button_0){
            mainString += "0";
            mainText.setText(mainString);
        } else if (viewId == R.id.button_1) {
            mainString += "1";
            mainText.setText(mainString);
        } else if (viewId == R.id.button_2) {
            mainString += "2";
            mainText.setText(mainString);
        }else if (viewId == R.id.button_3) {
            mainString += "3";
            mainText.setText(mainString);
        }else if (viewId == R.id.button_4) {
            mainString += "4";
            mainText.setText(mainString);
        }else if (viewId == R.id.button_5) {
            mainString += "5";
            mainText.setText(mainString);
        }else if (viewId == R.id.button_6) {
            mainString += "6";
            mainText.setText(mainString);
        }else if (viewId == R.id.button_7) {
            mainString += "7";
            mainText.setText(mainString);
        }else if (viewId == R.id.button_8) {
            mainString += "8";
            mainText.setText(mainString);
        }else if (viewId == R.id.button_9) {
            mainString += "9";
            mainText.setText(mainString);
        }
    }
}