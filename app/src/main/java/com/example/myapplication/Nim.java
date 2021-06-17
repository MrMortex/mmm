package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Nim extends AppCompatActivity {
    EditText n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=(EditText)findViewById(R.id.textN);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("N", n.getText().toString());
        startActivity(intent);
    }
}