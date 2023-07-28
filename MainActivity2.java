package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView secondText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        secondText = findViewById(R.id.secondText);
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.loginName);
        secondText.append(" "+text);
    }
}