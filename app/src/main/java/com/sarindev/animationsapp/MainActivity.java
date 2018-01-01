package com.sarindev.animationsapp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    long animDuration = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.iv_down_arrow);
    }

    public void handleAnimation(View view) {
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(img,"y",200.0f);
        animatorY.setDuration(animDuration);
        animatorY.setRepeatMode(ValueAnimator.REVERSE);
        animatorY.setRepeatCount(ValueAnimator.INFINITE);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorY);
        animatorSet.start();
    }
}
