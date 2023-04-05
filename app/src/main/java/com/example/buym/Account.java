package com.example.buym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Account extends AppCompatActivity {
    Button register,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        register = (Button) findViewById(R.id.button2);
        login = (Button) findViewById(R.id.button1);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RegisterAccount.class));
                Toast.makeText(Account.this, "Register now!", Toast.LENGTH_SHORT).show();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginAccount.class));
                Toast.makeText(Account.this, "Login to your account!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}