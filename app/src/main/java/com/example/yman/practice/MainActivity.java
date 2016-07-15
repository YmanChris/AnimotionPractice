package com.example.yman.practice;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Animation myAnimation;
    private ImageView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(ImageView)findViewById(R.id.text);
        myAnimation= AnimationUtils.loadAnimation(this,R.anim.myanim);
        textView.startAnimation(myAnimation);
    }
}
