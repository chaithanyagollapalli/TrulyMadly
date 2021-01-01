package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.trulymadly.R.layout.activity_basic_detail_screen_4;

public class BasicDetailsScreen4 extends AppCompatActivity {
    private Button mBtnNext2;
    private EditText mEtRelationshipStatus;
    private EditText mEtLocation;
    private EditText mEtHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_basic_detail_screen_4);
        mBtnNext2 = findViewById(R.id.btnNext2);
        mEtRelationshipStatus = findViewById(R.id.etRelationship);
        mEtLocation = findViewById(R.id.etLocation);
        mEtHeight = findViewById(R.id.etHeight);
        mBtnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDataValid()) {
                    Intent intent = new Intent(BasicDetailsScreen4.this, WorkAndEducation.class);
                    intent.putExtra("Relationship Status", mEtRelationshipStatus.getText().toString());
                    intent.putExtra("Location", mEtLocation.getText().toString());
                    startActivity(intent);
                }

            }
        });
    }

    private boolean isDataValid() {
        boolean isDataValid = true;

        if (mEtHeight.getText().toString().length() == 0) {
            mEtHeight.setError("Enter height");
            isDataValid = false;
        }

        if (mEtRelationshipStatus.getText().toString().length() == 0) {
            mEtRelationshipStatus.setError("Enter your Relationship Status");
            isDataValid = false;
        }
        for (int i = 0; i < mEtRelationshipStatus.getText().toString().length(); i++) {
            if (Character.isDigit(mEtRelationshipStatus.getText().toString().charAt(i))) {
                mEtRelationshipStatus.setError("Invalid");
                isDataValid = false;
            }
        }

        if (mEtLocation.getText().toString().length() == 0) {
            mEtLocation.setError("Enter your Location");
            isDataValid = false;
        }
        for (int i = 0; i < mEtLocation.getText().toString().length(); i++) {
            if (Character.isDigit(mEtLocation.getText().toString().charAt(i))) {
                mEtLocation.setError("Invalid location");
                isDataValid = false;
            }
        }
        return isDataValid;
    }
}