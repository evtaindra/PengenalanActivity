package com.example.aplikasike2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfilActivity extends AppCompatActivity {
TextView tvEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        tvEmail = findViewById(R.id.tvEmail);

        //Menerima data dari Intent yang membawa data Email
        String email = getIntent().getStringExtra("Email");
        tvEmail.setText(email);

        if(email != null){
            tvEmail.setText("Email: "+email);
        }

    }
}