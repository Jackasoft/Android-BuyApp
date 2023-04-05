package com.example.buym;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterAccount extends AppCompatActivity {
    Button button;
    EditText username,email,password,repeatPassword;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_account);
        button = (Button) findViewById(R.id.button4);

        username = findViewById(R.id.editTextTextPersonName2);
        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword2);
        repeatPassword = findViewById(R.id.editTextTextPassword3);
        auth = FirebaseAuth.getInstance();




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String email1 = email.getText().toString();
                String passwrd = password.getText().toString();
                String rePassword = repeatPassword.getText().toString();

                if (TextUtils.isEmpty(user)|| TextUtils.isEmpty(email1) || TextUtils.isEmpty(passwrd) || TextUtils.isEmpty(rePassword )) {
                    Toast.makeText(RegisterAccount.this, "No empty field is allowed!", Toast.LENGTH_SHORT).show();
                } else {
                    if (passwrd.equals(rePassword) ) {
                        if(passwrd.length() >= 6){
                            registerUser(email1,passwrd);
                        }else{
                            Toast.makeText(RegisterAccount.this, "password length must be >= 6 digits", Toast.LENGTH_SHORT).show();
                        }

                    } else {
                        Toast.makeText(RegisterAccount.this, "Passwords not correct!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
    public void registerUser(String email,String password){
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(RegisterAccount.this,new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    startActivity(new Intent(getApplicationContext(), LoginAccount.class));
                    Toast.makeText(RegisterAccount.this, "Registering user successful", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(RegisterAccount.this, "Registration failed", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}