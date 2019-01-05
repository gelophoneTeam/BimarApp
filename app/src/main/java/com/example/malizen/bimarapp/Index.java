package com.example.malizen.bimarapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.florent37.shapeofview.shapes.RoundRectView;
import com.mxn.soul.flowingdrawer_core.ElasticDrawer;
import com.mxn.soul.flowingdrawer_core.FlowingDrawer;

public class Index extends AppCompatActivity {
    RoundRectView daram,nadaram;
    private FlowingDrawer flowingDrawer;
    TextView txtMain,no,yes;
    private static final String TAG = Index.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        txtMain=(TextView) findViewById(R.id.txtMain);
        no=(TextView) findViewById(R.id.no);
        yes=(TextView) findViewById(R.id.yes);
        daram=(RoundRectView)findViewById(R.id.daram);
        nadaram=(RoundRectView)findViewById(R.id.nadaram);


        //set font
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/IRANSansWeb(FaNum).ttf");
        txtMain.setTypeface(tf);
        no.setTypeface(tf);
        yes.setTypeface(tf);

        //nos daram
//        daram.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i= new Intent(Index.this,NoskhDaram.class);
//                startActivity(i);
//            }
//        });
//nos nadaram
//        nadaram.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i= new Intent(Index.this,Noskhnadaram.class);
//                startActivity(i);
//            }
//        });
        //flowingActionBar
        flowingDrawer = (FlowingDrawer) findViewById(R.id.flowingdrawer);
        flowingDrawer.setTouchMode(ElasticDrawer.TOUCH_MODE_BEZEL);

        setupTolbar();


        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Toast.makeText(Index.this,item.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }


    private void setupTolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLayoutDirection(Gravity.END);
        toolbar.setNavigationIcon(R.drawable.ic_menu_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flowingDrawer.toggleMenu();
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (flowingDrawer.isMenuVisible()) {
            flowingDrawer.closeMenu();
        } else {
            super.onBackPressed();
        }
    }

}