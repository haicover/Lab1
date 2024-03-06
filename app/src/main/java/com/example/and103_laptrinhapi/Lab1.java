package com.example.and103_laptrinhapi;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Lab1 extends AppCompatActivity {
    TextView btnWithPhone,btnWithEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);

        btnWithEmail = findViewById(R.id.btnWithEmail);
        btnWithPhone = findViewById(R.id.btnWithPhone);

        btnWithEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lab1.this,Login.class));
            }
        });
        btnWithPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lab1.this,Phone.class));
            }
        });
    }
}