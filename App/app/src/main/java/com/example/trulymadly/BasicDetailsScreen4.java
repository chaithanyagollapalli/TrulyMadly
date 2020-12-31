package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicDetailsScreen4 extends AppCompatActivity {
    private Button btn2Next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_detail_screen_4);
        btn2Next=findViewById(R.id.btn2Next);
        btn2Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BasicDetailsScreen4.this,Imageone.class);
                startActivity(intent);
            }
        });

    }
}