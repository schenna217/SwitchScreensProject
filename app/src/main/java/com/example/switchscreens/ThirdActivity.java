package com.example.switchscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void switchScreens2(View view) {
        ImageView editText = findViewById(R.id.imageView);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}