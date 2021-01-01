package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NavigationMenuDrawer extends AppCompatActivity {

    private TextView mTvPreferences;
    private TextView mTvSettings;
    private TextView mTvApplyPromo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_menu_drawer);
        mTvPreferences = findViewById(R.id.tvPreferences);
        mTvSettings = findViewById(R.id.tvSettings);
        mTvApplyPromo = findViewById(R.id.tvApplyPromo);
        mTvPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationMenuDrawer.this, EditPreferences.class);
                startActivity(intent);
            }
        });
        mTvSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationMenuDrawer.this, Setting.class);
                startActivity(intent);
            }
        });
        mTvApplyPromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationMenuDrawer.this,ApplyPromocode.class);
                startActivity(intent);
            }
        });
    }
}