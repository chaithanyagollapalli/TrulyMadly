package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class katrina extends AppCompatActivity {

    private ImageView mImDoneKatrina;
    private ImageView mImCloseKatrina;
    private ImageButton mBtnMenuKatrina;
    private ImageView mIvChatKatrina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katrina);
        mImDoneKatrina = findViewById(R.id.imDoneKatrina);
        mImCloseKatrina = findViewById(R.id.imCloseKatrina);
        mBtnMenuKatrina = findViewById(R.id.btnMenuKatrina);
        mIvChatKatrina = findViewById(R.id.ivChatKatrina);

        mImDoneKatrina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(katrina.this, Imageone.class);
                startActivity(intent);
            }
        });
        mImCloseKatrina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(katrina.this, Imageone.class);
                startActivity(intent);
            }
        });
        mBtnMenuKatrina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(katrina.this, NavigationMenuDrawer.class);
                startActivity(intent);
            }
        });
        mIvChatKatrina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(katrina.this, Conversation.class);
                startActivity(intent);
            }
        });
    }
}