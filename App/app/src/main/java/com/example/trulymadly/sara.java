package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class sara extends AppCompatActivity {

    private ImageView mImDoneSara;
    private ImageView mImCloseSara;
    private ImageButton mBtnMenuSara;
    private ImageView mIvChatSara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sara);
        mImDoneSara = findViewById(R.id.imDoneSara);
        mImCloseSara = findViewById(R.id.imCloseSara);
        mBtnMenuSara = findViewById(R.id.btnMenuSara);
        mIvChatSara = findViewById(R.id.ivChatSara);

        mImDoneSara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sara.this, katrina.class);
                startActivity(intent);
            }
        });
        mImCloseSara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sara.this, katrina.class);
                startActivity(intent);
            }
        });
        mBtnMenuSara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sara.this, NavigationMenuDrawer.class);
                startActivity(intent);
            }
        });
        mIvChatSara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sara.this, Conversation.class);
                startActivity(intent);
            }
        });
    }
}