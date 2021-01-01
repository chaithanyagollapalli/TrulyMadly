package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ApplyPromocode extends AppCompatActivity {

    private TextView mTvBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_promocode);
        mTvBackButton = findViewById(R.id.tvBackButton);
        mTvBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApplyPromocode.this, NavigationMenuDrawer.class);
                startActivity(intent);
            }
        });
    }
}