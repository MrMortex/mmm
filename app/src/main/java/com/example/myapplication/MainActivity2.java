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
    int N, k = 1;
    int[] numberK;
    TextView deskTop;
    EditText step;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        step = (EditText) findViewById(R.id.textE);
        //получение данных из MainActivity
        Bundle arguments = getIntent().getExtras();
        n = arguments.getString("N");
        deskTop = (TextView) findViewById(R.id.textDeskTop);
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
                if (Integer.parseInt(strArr[0]) <= k) {
                    numberK[Integer.parseInt(strArr[0])-1]=Integer.parseInt(strArr[1]);
                    k++;
                    //numberK(Integer.parseInt(strArr[2]);
                    for ( int k = 1; k < N; k++) {
                        deskTop.setText(Integer.parseInt(strArr[k+1]) + " ");
                        step.setText("");
                    }
                } else step.setText("Введите другие данные");
            } else
                step.setText("Введите другие данные");
        }
        else step.setText("Введите другие данные");
    }
}