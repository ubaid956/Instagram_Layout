package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class profilePictureActivity extends AppCompatActivity {
    private Button profileButton,skipButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_picture);
        profileButton = findViewById(R.id.profileButton);
        skipButton = findViewById(R.id.skipButton);
        profileButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        skipButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(profilePictureActivity.this, "Profile Picture skipped", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(profilePictureActivity.this, welcomeActivity.class);

                startActivity(intent);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(profilePictureActivity.this, "Profile Picture Added", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(profilePictureActivity.this, welcomeActivity.class);
                startActivity(intent);
            }
        });

    }
}