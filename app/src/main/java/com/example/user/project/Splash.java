package com.example.user.project;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tv=(TextView) findViewById(R.id.tv);
        iv=(ImageView)findViewById(R.id.iv);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"fonts/Amatic-Bold.ttf");
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransiction);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);
        tv.setTypeface(myCustomFont);
        final Intent i= new Intent(this,cat.class);
        Thread timer = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                 startActivity(i);
                 finish();
                }
            }
        };
        timer.start();
    }
}
