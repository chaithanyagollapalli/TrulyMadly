package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.trulymadly.FacebookLoginScreen;
import com.example.trulymadly.MobileLoginScreen;
import com.example.trulymadly.R;

public class StartScreen extends AppCompatActivity {

    private Button mBtnMobile;
    private Button mBtnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        mBtnMobile = findViewById(R.id.btnMobile);
        mBtnFacebook = findViewById(R.id.btnFacebook);

        mBtnMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartScreen.this, MobileLoginScreen.class);
                startActivity(intent);
            }
        });

        mBtnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartScreen.this, FacebookLoginScreen.class);
                startActivity(intent);
            }
        });
    }
}