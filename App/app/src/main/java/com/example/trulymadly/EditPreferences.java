package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EditPreferences extends AppCompatActivity {

    private Button mBtnSave2;
    private ImageButton mIbBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_preferences);
        mBtnSave2 = findViewById(R.id.btnSave2);
        mIbBackButton = findViewById(R.id.ibBackButton);
        mBtnSave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditPreferences.this,Imageone.class);
                startActivity(intent);
            }
        });
        mIbBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditPreferences.this, NavigationMenuDrawer.class);
                startActivity(intent);
            }
        });
    }
}