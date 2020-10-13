package com.napTechLab.splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    Animation top_anim,bottom_anim;
    ImageView image;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        top_anim= AnimationUtils.loadAnimation(this,R.anim.slide_right);
        bottom_anim=AnimationUtils.loadAnimation(this,R.anim.slide_left);

        image=(ImageView)findViewById(R.id.image);
        text=( TextView) findViewById(R.id.text);
        image.setAnimation(top_anim);
        text.setAnimation(bottom_anim);

        Handler hendler= new Handler();
        hendler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashActivity.this,Activity.class);
                startActivity(intent);
                finish();
            }
        },2500);
    }
}