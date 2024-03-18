package com.example.myshoppingmng;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView usernameTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameTextView = findViewById(R.id.usernameEditText);

        // Retrieve username from intent extras
        String username = getIntent().getStringExtra("username");
        usernameTextView.setText("Welcome, " + username + "!");
    }
}
