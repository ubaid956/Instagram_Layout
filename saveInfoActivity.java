package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class saveInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_info);
        Button notButton = findViewById(R.id.notButton);
        notButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));

        notButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(saveInfoActivity.this, "Login Info not Saved!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(saveInfoActivity.this, birthdayActivity.class);
                startActivity(intent);
            }
        });

        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(saveInfoActivity.this, "Login Info Saved", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(saveInfoActivity.this, birthdayActivity.class);
                startActivity(intent);
            }
        });
    }
}