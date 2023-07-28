package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class agrreeActivity extends AppCompatActivity {
    private Button agreeNextButton;
    private TextView agreeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agrree);
        agreeNextButton = findViewById(R.id.agreeNextButton);
        agreeNextButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        agreeTextView = findViewById(R.id.agreeTextView);
        agreeNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(agrreeActivity.this, profilePictureActivity.class);
                startActivity(intent);
            }
        });

        agreeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(agrreeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }) ;
    }
}