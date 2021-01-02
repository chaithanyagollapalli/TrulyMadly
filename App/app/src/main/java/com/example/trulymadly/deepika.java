package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class deepika extends AppCompatActivity {

    private ImageView mImDoneDeepika;
    private ImageView mImCloseDeepika;
    private ImageButton mBtnMenuDeepika;
    private ImageView mIvChatDeepika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deepika);
        mImDoneDeepika = findViewById(R.id.imDoneDeepika);
        mImCloseDeepika = findViewById(R.id.imCloseDeepika);
        mBtnMenuDeepika = findViewById(R.id.btnMenuDeepika);
        mIvChatDeepika = findViewById(R.id.ivChatDeepika);
        mImDoneDeepika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(deepika.this, sara.class);
                startActivity(intent);
            }
        });
        mImCloseDeepika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(deepika.this, sara.class);
                startActivity(intent);
            }
        });
        mBtnMenuDeepika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(deepika.this, NavigationMenuDrawer.class);
                startActivity(intent);
            }
        });
        mIvChatDeepika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(deepika.this, Conversation.class);
                startActivity(intent);
            }
        });
    }
}