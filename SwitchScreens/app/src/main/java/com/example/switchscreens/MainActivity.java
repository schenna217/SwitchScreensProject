package com.example.switchscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void switchScreens(View view) {
        ImageView editText = findViewById(R.id.imageView);
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void switchScreens2(View view) {
        ImageView editText = findViewById(R.id.imageView);
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

}