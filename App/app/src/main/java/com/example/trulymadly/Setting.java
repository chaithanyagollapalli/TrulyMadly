package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Setting extends AppCompatActivity {

    private TextView mTvBackSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        mTvBackSettings = findViewById(R.id.tvBackSettings);
        mTvBackSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Setting.this,NavigationMenuDrawer.class);
                startActivity(intent);
            }
        });
    }
}