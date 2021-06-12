package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
/*    String n;
    int N;
    TextView deskTop;
    EditText step;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//step=(EditText) findViewById(R.id.textE);
        //получение данных из MainActivity
/*        Bundle arguments = getIntent().getExtras();
        n= arguments.getString("N");
        deskTop=(TextView) findViewById(R.id.textDeskTop);
        N=Integer.parseInt(n);
        deskTop.setText(n);*/
        //*********************************
    }
    public void onClick(View view) {
/*        n=step.getText().toString();
        String strArr[] = n.split(" ");
            deskTop.setText(Integer.parseInt(strArr[1])+" "+Integer.parseInt(strArr[2]));
            step.setText("");*/
    }

}