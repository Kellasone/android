package com.example.androidfinal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidfinal.R;
import com.example.androidfinal.services.AuthService;

public class MainActivity extends AppCompatActivity {

    AuthService auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        auth = new AuthService();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(auth.getCurrentUser() != null)
            setContentView(R.layout.activity_main);
        else setContentView(R.layout.activity_log_in_or_register);
    }
}
