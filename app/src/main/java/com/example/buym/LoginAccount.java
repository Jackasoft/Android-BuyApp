package com.example.buym;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginAccount extends AppCompatActivity {
    Button login,register;
    EditText email,password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_account);

        login = findViewById(R.id.button3);
        register = findViewById(R.id.register);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("") || password.getText().toString().equals("")){
                    Toast.makeText(LoginAccount.this, "Empty fields not allowed!", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(new Intent(getApplicationContext(),Home.class));
                    Toast.makeText(LoginAccount.this, "Welcome home!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RegisterAccount.class));
            }
        });
    }

    public void SecondActivity(View view) {
    }
}