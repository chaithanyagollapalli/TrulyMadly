package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.trulymadly.R.layout.activity_basic_detail_screen_4;


public class BasicDetailsScreen4 extends AppCompatActivity {
    private Button mBtnNext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_basic_detail_screen_4);
        mBtnNext2 = findViewById(R.id.btn2Next);
        mBtnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicDetailsScreen4.this, EducationInformation.class);
                startActivity(intent);
            }
        });
    }
}