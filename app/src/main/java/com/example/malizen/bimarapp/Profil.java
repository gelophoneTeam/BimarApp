package com.example.malizen.bimarapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Profil extends Activity {

    public static int[] osImages = {
            R.drawable.ic_user,
            R.drawable.ic_genders,
            R.drawable.ic_weight,
            R.drawable.ic_blood,
            R.drawable.ic_height,
            R.drawable.ic_heartbeat,};

    GridView gridview;

    public static String[] osNameList = {
            "سن",
            "جنسیت",
            "وزن",
            "گروه خونی",
            "قد",
            "درصد سلامت",
    };

    public static String[] osNameSec = {
            "18",
            "مرد",
            "65",
            "AB",
            "175",
            "%80",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new CustomAdapter(this, osNameList, osImages,osNameSec));
    }
}
