package com.example.malizen.bimarapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ToxicBakery.viewpager.transforms.RotateUpTransformer;

import steelkiwi.com.library.view.IndicatorView;

public class Introduction extends AppCompatActivity {
    private ViewPager viewPager;
    private MyPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(true, new RotateUpTransformer());

        IndicatorView indicator = (IndicatorView) findViewById(R.id.indicator);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        indicator.attachViewPager(viewPager);


    }
}
