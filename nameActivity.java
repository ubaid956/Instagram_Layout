package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nameActivity extends AppCompatActivity {
    private  TextView accountTextView;
    private Button nameButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        accountTextView = findViewById(R.id.phoneAccount);
        nameButton = findViewById(R.id.nameButton);
        nameButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nameActivity.this, passActivity.class );
                startActivity(intent);
            }
        });

        accountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nameActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}