package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DateFormatSymbols;

import java.util.Calendar;
import java.util.Locale;

public class birthdayActivity extends AppCompatActivity {
    private EditText birthdayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        birthdayText = findViewById(R.id.birthdayText);
        Button birthDayNext = findViewById(R.id.birthDayNext);
        birthDayNext.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate = formatter.format(currentDate);
        birthDayNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(birthdayActivity.this, userNameActivity.class);
                startActivity(intent);
            }
        });
        birthdayText.setText(formattedDate.toString());

        birthdayText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current date
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                // Create a DatePickerDialog and set the selected date
                DatePickerDialog datePickerDialog = new DatePickerDialog(birthdayActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                // Handle the selected date
                                // You can retrieve the selected year, month, and dayOfMonth values here
                                // and perform any necessary operations with them
                                String[] monthNames = new DateFormatSymbols().getMonths();
                                String selectedMonth = monthNames[month];

                                // Display the selected date
                                String selectedDate = String.format(Locale.getDefault(), "%s %02d, %04d", selectedMonth, dayOfMonth, year);
                                birthdayText.setText(selectedDate.toString());

                            }
                        }, year, month, day);

                // Show the DatePickerDialog
                datePickerDialog.show();

            }
        });

}
    }

