package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class userNameActivity extends AppCompatActivity {
    private EditText userNameText;
    private TextView userTextView;
    public  static final String extraText = "com.example.instagram to login.extraText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_name);
        Button userNameNext = findViewById(R.id.userNameNext);
        userNameText = findViewById(R.id.userNameText);
        userNameNext.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));

        userNameNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(userNameActivity.this, welcomeActivity.class);
                String text = userNameText.getText().toString();
//                intent.putExtra(extraText, text);
//                SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString(extraText, text);
//                editor.apply();
//
                SharedPreferences sp = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                SharedPreferences.Editor ed = sp.edit();
                ed.putString(extraText, text);
                ed.apply();

                Intent next = new Intent(userNameActivity.this, phoneActivity.class);
                startActivity(next);
            }
        });
        userTextView = findViewById(R.id.userTextView);
        userTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userNameActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}