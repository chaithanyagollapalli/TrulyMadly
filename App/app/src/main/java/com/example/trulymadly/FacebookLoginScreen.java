package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacebookLoginScreen extends AppCompatActivity {
    private Button mBtnContinueFb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login_screen);

        mBtnContinueFb=findViewById(R.id.btnContinueFb);
        mBtnContinueFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FacebookLoginScreen.this, AboutYouScreen3.class);
                startActivity(intent);
            }
        });

    }
}