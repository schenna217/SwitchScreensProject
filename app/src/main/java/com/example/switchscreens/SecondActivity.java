package com.example.switchscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void switchScreens(View view) {
        ImageView editText = findViewById(R.id.imageView);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}