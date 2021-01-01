package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MobileLoginScreen extends AppCompatActivity {
    private Button mBtnContinue;
    private EditText mEtPhoneNumber;
    private EditText mEtVerificationCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_login_screen);
        mBtnContinue = findViewById(R.id.btnContinue);
        mEtPhoneNumber = findViewById(R.id.etPhoneNumber);
        mEtVerificationCode = findViewById(R.id.etVerificationCode);
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDataValid()) {
                    Intent intent = new Intent(MobileLoginScreen.this, AboutYouScreen3.class);
                    startActivity(intent);
                }
            }
        });
    }
    private boolean isDataValid () {

        boolean isDataValid =true;

        if (mEtPhoneNumber.getText().toString().length()<10){
            mEtPhoneNumber.setError("Number is invalid");
            isDataValid =false;
        }

        if (mEtPhoneNumber.getText().toString().length()>10){
            mEtPhoneNumber.setError("Number is invalid");
            isDataValid =false;
        }

        if (mEtVerificationCode.getText().toString().length()<4){
            mEtVerificationCode.setError("Code is invalid");
            isDataValid =false;
        }


        return  isDataValid;
    }
}

