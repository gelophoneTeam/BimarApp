package com.example.malizen.bimarapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {
    ImageView imgLog;
    TextView txtLog;
    EditText phone,family;
    Button btnLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        txtLog=(TextView) findViewById(R.id.txtLog);
        phone=(EditText) findViewById(R.id.phone);
        family=(EditText) findViewById(R.id.family);
        btnLog=(Button) findViewById(R.id.btnLog);


//set fonts
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/IRANSansWeb(FaNum).ttf");
        txtLog.setTypeface(tf);
        phone.setTypeface(tf);
        family.setTypeface(tf);
        btnLog.setTypeface(tf);


        imgLog=(ImageView) findViewById(R.id.sign);
        imgLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(LogIn.this, SignUp.class));
                overridePendingTransition(R.anim.animation1, R.anim.animation2);
            }
        });
    }


}
