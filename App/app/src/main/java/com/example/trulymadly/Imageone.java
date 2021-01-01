package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Imageone extends AppCompatActivity {

    private ImageButton mBtnMenu;
    private ImageView mIvChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageone);
        InitializeViewsAndListeners();
    }

    private void InitializeViewsAndListeners() {
        mBtnMenu = findViewById(R.id.btnMenu);
        mIvChat = findViewById(R.id.ivChat);

        mBtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Imageone.this,NavigationMenuDrawer.class);
                startActivity(intent);
            }
        });
        mIvChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Imageone.this,Conversation.class);
                startActivity(intent);
            }
        });
    }
}