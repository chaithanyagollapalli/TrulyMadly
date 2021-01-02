package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Imageone extends AppCompatActivity {

    private ImageButton mBtnMenu;
    private ImageView mIvChat;
    private ImageView mImDone;
    private ImageView mImClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageone);
        InitializeViewsAndListeners();
    }

    private void InitializeViewsAndListeners() {
        mBtnMenu = findViewById(R.id.btnMenu);
        mIvChat = findViewById(R.id.ivChat);
        mImClose = findViewById(R.id.imClose);
        mImDone = findViewById(R.id.ivDone);

        mImClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Imageone.this, deepika.class);
                startActivity(intent);
            }
        });
        mImDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Imageone.this, deepika.class);
                startActivity(intent);
            }
        });

        mBtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Imageone.this, NavigationMenuDrawer.class);
                startActivity(intent);
            }
        });
        mIvChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Imageone.this, Conversation.class);
                startActivity(intent);
            }
        });
    }
}