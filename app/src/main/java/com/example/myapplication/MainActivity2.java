package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {
    String n;
    int N, k =0;
    int[] numberK;
    TextView deskTop,textPlayer;
    EditText step;
    int pN=1;
    final String playerNumber1="Первый игрок",playerNumber2="Второй игрок";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        step = (EditText) findViewById(R.id.textE);
        //получение данных из MainActivity
        Bundle arguments = getIntent().getExtras();
        n = arguments.getString("N");
        deskTop = (TextView) findViewById(R.id.textDeskTop);
        textPlayer = (TextView) findViewById(R.id.textPlayer); textPlayer.setText(playerNumber1);
        N = Integer.parseInt(n);
        deskTop.setText(n);
        //*********************************
        numberK = new int[N];
        numberK[k] = N;
    }

    public void onClick(View view) {
        n = step.getText().toString();
        String strArr[] = n.split(" ");
        if (numberK[Integer.parseInt(strArr[0])-1] == Integer.parseInt(strArr[1]) + Integer.parseInt(strArr[2])) {
            if (Integer.parseInt(strArr[1]) != Integer.parseInt(strArr[2])) {
                if (Integer.parseInt(strArr[0]) <= k+1) {
                    numberK[Integer.parseInt(strArr[0])-1]=Integer.parseInt(strArr[1]);
                    k++;
                    numberK[k]=Integer.parseInt(strArr[2]);
                    String s="";
                    boolean key=true;
                    for ( int i = 0; i <= k; i++) {
                        s+=numberK[i] + " ";
                        if(numberK[i]>2) key=false;
                    }
                    deskTop.setText(s);
                    step.setText("");
                    if(key) {step.setText("Игра окончена! Поздравляем с победой!");}

                    if(pN==1) {pN=2; textPlayer.setText(playerNumber2);}
                    else {pN=1; textPlayer.setText(playerNumber1);}
                } else step.setText("Введите другие данные");
            } else
                step.setText("Введите другие данные");
        }
        else step.setText("Введите другие данные");
    }
}