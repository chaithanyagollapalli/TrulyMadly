package com.example.trulymadly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

<<<<<<< HEAD
public class BasicDetailsScreen4 extends AppCompatActivity {
    private Button btn2Next;
=======
import static com.example.trulymadly.R.layout.activity_basic_detail_screen_4;
>>>>>>> c44875eeb17fe8dc5d917047bc076444db9a7b31

public class BasicDetailsScreen4 extends AppCompatActivity {
    private Button mBtnNext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_basic_detail_screen_4);
        btn2Next=findViewById(R.id.btn2Next);
        btn2Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BasicDetailsScreen4.this,Imageone.class);
                startActivity(intent);
            }
        });

=======
        setContentView(activity_basic_detail_screen_4);
        mBtnNext2 = findViewById(R.id.btn2Next);
        mBtnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicDetailsScreen4.this, EducationInformation.class);
                startActivity(intent);
            }
        });
>>>>>>> c44875eeb17fe8dc5d917047bc076444db9a7b31
    }
}