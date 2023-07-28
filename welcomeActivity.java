package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class welcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView WelcomeText = findViewById(R.id.WelcomeText);
//        Intent intent = getIntent();
//        String welText = intent.getStringExtra(userNameActivity.extraText);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String data = sharedPreferences.getString(userNameActivity.extraText , "");

//        if (welText == null) {
        WelcomeText.setText("Welcome to Instagram "+ data);
//        }
    }
}