package com.example.aplikasike2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginActivity extends AppCompatActivity {
Button btn;
EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email =findViewById(R.id.email);
        password = findViewById(R.id.password);
       btn = findViewById(R.id.btnLogin);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String emailUser = email.getText().toString();
               String passwordUser = password.getText().toString();
               if (email.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                   Toast.makeText(loginActivity.this, "Email atau Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
               }
               else{
                   //proses login yang membawa Intent ke ProfilActivity dan membawa data Email
                   Intent  angkutan = new Intent(loginActivity.this, ProfilActivity.class);
                   angkutan.putExtra("Email", emailUser);
                   startActivity(angkutan);
               }
           }
       });

    }

}