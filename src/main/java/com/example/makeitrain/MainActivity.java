package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private int moneyCounter = 0;
    private int resetCounter = 0;
    private TextView moneyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.money_text);

    }

    public void showTag(View view){

        NumberFormat numberFormat_1 = NumberFormat.getCurrencyInstance();

        moneyText.setText(String.valueOf(numberFormat_1.format(resetCounter)));

        Log.d("MYTAG", "onClick: Show Money" + resetCounter);


    }

    public void makeItRain(View v){

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));

        switch (moneyCounter)
        {
            case 1000:
                moneyText.setTextColor(Color.RED);
            break;

            case 6000:
                moneyText.setTextColor(Color.GREEN);
                break;

            case 10000:
                Log.d("MIR", "makeItRaint: Tapped: " + (moneyCounter=0));
                moneyText.setTextColor(Color.WHITE);
            break;
        }


        Log.d("MIR", "makeItRaint: Tapped: " + moneyCounter);

    }

}
