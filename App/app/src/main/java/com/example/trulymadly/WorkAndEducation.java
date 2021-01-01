package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WorkAndEducation extends AppCompatActivity {

    private Button mBtnNext3;
    private EditText mEtHighestDegree;
    private EditText mEtOccupation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_and_education);
        mBtnNext3 = findViewById(R.id.btnNext3);
        mEtHighestDegree = findViewById(R.id.etHighestDegree);
        mEtOccupation = findViewById(R.id.etOccupation);
        mBtnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDataValid()) {
                    Intent intent = new Intent(WorkAndEducation.this, DescribeYourself6.class);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean isDataValid() {
        boolean isDataValid = true;

        if (mEtHighestDegree.getText().toString().length() == 0) {
            mEtHighestDegree.setError("Enter your Education");
            isDataValid = false;
        }
        for (int i = 0; i < mEtHighestDegree.getText().toString().length(); i++) {
            if (Character.isDigit(mEtHighestDegree.getText().toString().charAt(i))) {
                mEtHighestDegree.setError("Invalid");
                isDataValid = false;
            }
        }

        if (mEtOccupation.getText().toString().length() == 0) {
            mEtOccupation.setError("Enter your Occupation");
            isDataValid = false;
        }
        for (int i = 0; i < mEtOccupation.getText().toString().length(); i++) {
            if (Character.isDigit(mEtOccupation.getText().toString().charAt(i))) {
                mEtOccupation.setError("Invalid");
                isDataValid = false;
            }
        }
        return isDataValid;
    }
}