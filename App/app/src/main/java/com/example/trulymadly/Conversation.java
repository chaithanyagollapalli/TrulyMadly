package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Conversation extends AppCompatActivity {

    private CardView mCvAlia;
    private CardView mCvMissTm;
    private ImageView mIvBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);
        mCvAlia = findViewById(R.id.cvAlia);
        mCvMissTm = findViewById(R.id.cvMissTim);
        mIvBackButton = findViewById(R.id.ivBackButton);
        mCvAlia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversation.this, AliaChat.class);
                startActivity(intent);
            }
        });
        mCvMissTm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversation.this,MessageSendapp.class);
                startActivity(intent);
            }
        });
        mIvBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversation.this, Imageone.class);
                startActivity(intent);
            }
        });
    }
}