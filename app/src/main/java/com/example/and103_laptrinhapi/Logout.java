package com.example.and103_laptrinhapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Logout extends AppCompatActivity {
    FirebaseAuth mAuth;
    TextView btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        mAuth = FirebaseAuth.getInstance();
        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseUser currentUser = mAuth.getCurrentUser();
                if (currentUser != null) { // Kiểm tra xem có người dùng nào đang đăng nhập không
                    mAuth.signOut();
                    Toast.makeText(Logout.this, "Đăng xuất thành công", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Logout.this, MainActivity.class));
                } else {
                    Toast.makeText(Logout.this, "Đăng xuất thất bại. Không có người dùng đang đăng nhập", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}