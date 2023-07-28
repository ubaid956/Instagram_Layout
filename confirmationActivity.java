package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class confirmationActivity extends AppCompatActivity {
    private Button confNextButton, notGetButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        confNextButton = findViewById(R.id.confNextButton);
        confNextButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        confNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(confirmationActivity.this, agrreeActivity.class);
                startActivity(intent);
            }
        });
        notGetButton = findViewById(R.id.notGetButton);
        notGetButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));

        notGetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(confirmationActivity.this, "We are sending code please wait", Toast.LENGTH_LONG).show();

            }
        });
    }
}