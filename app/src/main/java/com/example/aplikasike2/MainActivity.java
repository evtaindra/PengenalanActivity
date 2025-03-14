package com.example.aplikasike2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button satu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        satu = findViewById(R.id.button3);
        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  angkutan = new Intent(MainActivity.this, KeduaActivity.class);
                startActivity(angkutan);
            }
        });
    }
}