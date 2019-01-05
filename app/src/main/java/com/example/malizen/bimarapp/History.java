package com.example.malizen.bimarapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class History extends Activity {

    public static int[] osImages = {
            R.drawable.ic_resume,
            R.drawable.ic_loan,
            R.drawable.ic_vespa,
            R.drawable.ic_cargo_truck,
    };

    ListView listview;

    public static String[] osNameList = {
            "سفارش شما تایید شد.",
            "سفارش شما در حال آماده سازی است.",
            "سفارش شما ارسال شد.",
            "سفارش شما تحویل داده شد.",

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);

        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new Adapter(this, osNameList, osImages));


    }


}
