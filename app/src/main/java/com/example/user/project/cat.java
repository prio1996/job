package com.example.user.project;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class cat extends AppCompatActivity {
    private TextView tvv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        tvv=(TextView) findViewById(R.id.tv);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"fonts/Amatic-Bold.ttf");
        tvv.setTypeface(myCustomFont);
    }
}
