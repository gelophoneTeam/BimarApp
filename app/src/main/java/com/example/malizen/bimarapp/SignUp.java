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

public class SignUp extends AppCompatActivity {
    ImageView imgSign,manB,womanB;
    TextView txtSign,txtfemal,txtmale,befor;
    EditText phones,familys,names;
    Button btnSign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtSign=(TextView) findViewById(R.id.txtSign);
        txtfemal=(TextView) findViewById(R.id.woman);
        txtmale=(TextView) findViewById(R.id.man);
        befor=(TextView) findViewById(R.id.befor);
        phones=(EditText) findViewById(R.id.phones);
        names=(EditText) findViewById(R.id.names);
        familys=(EditText) findViewById(R.id.familys);
        btnSign=(Button) findViewById(R.id.btnSign);
        manB=(ImageView) findViewById(R.id.manB);
        womanB=(ImageView) findViewById(R.id.womanB);

//        addClickEffectM(manB);
//       addClickEffectW(womanB);

//set fonts
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/IRANSansWeb(FaNum).ttf");
        txtSign.setTypeface(tf);
        phones.setTypeface(tf);
        familys.setTypeface(tf);
        names.setTypeface(tf);
        befor.setTypeface(tf);
        txtfemal.setTypeface(tf);
        txtmale.setTypeface(tf);
        btnSign.setTypeface(tf);

        befor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, LogIn.class);

                startActivity(intent);
            }
        });

//        btnSign.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent1 = new Intent(SignUp.this, Index.class);
//                startActivity(intent1);
//            }
//        });
        imgSign=(ImageView) findViewById(R.id.signs);
        imgSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this, LogIn.class));
                overridePendingTransition(R.anim.left1, R.anim.right1);
            }
        });



    }

}
