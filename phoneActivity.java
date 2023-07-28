package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phoneActivity extends AppCompatActivity {
   private Button phoneButton, signUpMail;
   private TextView phoneTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        phoneButton = findViewById(R.id.phoneButton);
        signUpMail = findViewById(R.id.signUpMail);
        phoneButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        signUpMail.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phoneActivity.this, confirmationActivity.class);
                startActivity(intent);


            }
        });

        signUpMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phoneActivity.this, confirmationActivity.class);
                startActivity(intent);

            }
        });
        phoneTextView = findViewById(R.id.phoneTextView);
        phoneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phoneActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}