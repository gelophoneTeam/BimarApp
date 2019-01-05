package com.example.malizen.bimarapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        YoYo.with(Techniques.Wobble)
                .duration(1000)
                .repeat(5)
                .playOn(findViewById(R.id.img));



        TextView tv = (TextView)findViewById(R.id.txt1);
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/IRANSansWeb(FaNum).ttf");
        tv.setTypeface(tf);
        TextView tv1 = (TextView)findViewById(R.id.txt2);
        Typeface tf1 = Typeface.createFromAsset(getAssets(),"fonts/IRANSansWeb(FaNum).ttf");
        tv.setTypeface(tf);
        TextView tn2 = (TextView)findViewById(R.id.txt3);
        Typeface tf2 = Typeface.createFromAsset(getAssets(),"fonts/IRANSansWeb(FaNum).ttf");
        tv.setTypeface(tf);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this,LogIn.class);
                startActivity(i);
                finish();

            }
        },3000);
    }
}