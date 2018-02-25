package com.example.fadhlanalhirzi.mfadhlanalhirzi_1202144021_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText vUser, vPassword;
    private Button vButton;

    private String username = "EAD";
    private String password = "MOBILE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast.makeText(this, "Selamat Datang!", Toast.LENGTH_LONG);

        vUser = (EditText) findViewById(R.id.username);
        vPassword = (EditText) findViewById(R.id.password);
        vButton = (Button) findViewById(R.id.btnLogin);

    }


    public void login(View view) {
        if (valueLogin()) {
            Intent newAct = new Intent(this, MainActivity.class);
            startActivity(newAct);
        } else {
            Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show();
        }
    }


    public boolean valueLogin() {
        boolean login;

        if (vUser.getText().toString().equals(username) && vPassword.getText().toString().equals(password)) {
            login = true;
        } else {
            login = false;
        }
        return login;
    }
}
