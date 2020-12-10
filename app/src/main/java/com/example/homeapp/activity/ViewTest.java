package com.example.homeapp.activity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homeapp.R;
import com.example.homeapp.view.CustomView;

public class ViewTest extends AppCompatActivity {

    private CustomView customView;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_test);

        initView();
    }

    private void initView(){
        customView = findViewById(R.id.custom_view);
        textView = findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveViweAnimator();
            }
        });
    }

    private void moveViweAnimator(){
        // 属性动画
        if (null == customView) return;
        ObjectAnimator.ofFloat(customView, "translationX",
                0, 300).setDuration(1000).start();
    }
}
