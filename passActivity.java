package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class passActivity extends AppCompatActivity {
   private TextView accountTextView;
   private Button passNextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        accountTextView = findViewById(R.id.phoneAccount);
        passNextButton = findViewById(R.id.saveButton);
        passNextButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        passNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(passActivity.this, saveInfoActivity.class);
                startActivity(intent);
            }
        });
        accountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(passActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}