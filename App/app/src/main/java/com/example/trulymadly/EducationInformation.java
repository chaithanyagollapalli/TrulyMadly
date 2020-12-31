package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EducationInformation extends AppCompatActivity {

    private Button mBtnNext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_information);

        mBtnNext3=findViewById(R.id.btnNext3);
        mBtnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationInformation.this, DescribeYourself6.class);
                startActivity(intent);
            }
        });
    }
}