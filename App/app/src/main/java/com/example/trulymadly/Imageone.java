package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Imageone extends AppCompatActivity {

    private ImageButton mIbBar1;
    private ImageButton mIbBar2;
    private ImageButton mIbBar3;
    private ImageButton mIbBar4;
    private ImageButton mIbBar5;
    private View mVNB1;
    private View mVNB2;
    private View mVNB3;
    private View mVNB4;
    private View mVNB5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageone);
        InitializeViewsAndListeners();
    }

    private void InitializeViewsAndListeners() {
        mIbBar1 = findViewById(R.id.ibBar1);
        mIbBar2 = findViewById(R.id.ibBar2);
        mIbBar3 = findViewById(R.id.ibBar3);
        mIbBar4 = findViewById(R.id.ibBar4);
        mIbBar5 = findViewById(R.id.ibBar5);
        mVNB1 = findViewById(R.id.viewNB1);
        mVNB2 = findViewById(R.id.viewNB2);
        mVNB3 = findViewById(R.id.viewNB3);
        mVNB4 = findViewById(R.id.viewNB4);
        mVNB5 = findViewById(R.id.viewNB5);

        mIbBar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mVNB2.getVisibility() == View.VISIBLE){
                    mVNB2.setVisibility(View.INVISIBLE);
                } else {
                    mVNB2.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}