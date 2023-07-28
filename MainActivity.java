package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView faceBook, userName, signUp;
    private Button login;

    public  static final String loginName = "com.example.instagramlogin.loginName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        faceBook = findViewById(R.id.faceBook);
        signUp = findViewById(R.id.signUp);
        userName = findViewById(R.id.userName);
        login.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        faceBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri web = Uri.parse("https://m.facebook.com/?wtsid=rdr_0hm2znlwPTcTnlSyh");
                Intent intent = new Intent(Intent.ACTION_VIEW, web);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String text = userName.getText().toString();
                intent.putExtra(loginName, text);
                startActivity(intent);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, nameActivity.class);
                startActivity(intent);
            }
        });
    }
}