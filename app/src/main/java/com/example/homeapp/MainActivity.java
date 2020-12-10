package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.homeapp.activity.ViewTest;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Button mBtnViewTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        mBtnViewTest = findViewById(R.id.btn_view_test);
        mBtnViewTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewTest();
            }
        });
    }

    private void startViewTest(){
        Intent intent = new Intent(MainActivity.this, ViewTest.class);
        startActivity(intent);
    }
}
