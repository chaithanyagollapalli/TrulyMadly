package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AboutYouScreen3 extends AppCompatActivity {
    private Button btnNext;
    private EditText mEtName;
    private EditText mEtSurname;
    private EditText mEtEmail;
    private EditText mEtDate;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__you_screen_3);

        btnNext = findViewById(R.id.btnNext);
        mEtName = findViewById(R.id.etName);
        mEtSurname = findViewById(R.id.etSurname);
        mEtEmail = findViewById(R.id.etEmail);
        mEtDate = findViewById(R.id.etDate);
        radioGroup = findViewById(R.id.radioGroup);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDataValid()) {
                    Intent intent = new Intent(AboutYouScreen3.this, BasicDetailsScreen4.class);
                    intent.putExtra("Name", mEtName.getText().toString());
                    intent.putExtra("Surname", mEtSurname.getText().toString());
                    int radioId = radioGroup.getCheckedRadioButtonId();
                    radioButton = findViewById(radioId);
                    startActivity(intent);
                }
            }


        });
    }

    private boolean isDataValid() {

        boolean isDataValid = true;


        if (mEtName.getText().toString().length()==0) {
            mEtName.setError("Add your Name");
            isDataValid = false;
        }
        for (int i = 0; i < mEtName.getText().toString().length(); i++) {
            if (Character.isDigit(mEtName.getText().toString().charAt(i))) {
                mEtName.setError("Invalid Name");
                isDataValid = false;
            }
        }

        if (mEtSurname.getText().toString().length()==0) {
            mEtSurname.setError("Add your Surname");
            isDataValid = false;
        }
        for (int i = 0; i < mEtSurname.getText().toString().length(); i++) {
            if (Character.isDigit(mEtSurname.getText().toString().charAt(i))) {
                mEtSurname.setError("Invalid Surname");
                isDataValid = false;
            }
        }

        if (!mEtEmail.getText().toString().contains("@gmail.com")) {
            mEtEmail.setError("Invalid Email ID");
            isDataValid = false;
        }

        if (mEtDate.getText().toString().length()<10){
            mEtDate.setError("Date of Birth invalid");
            isDataValid = false;
        }

        if (mEtDate.getText().toString().length()>10){
            mEtDate.setError("Date of Birth invalid");
            isDataValid = false;
        }

        return isDataValid;

    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
    }

}