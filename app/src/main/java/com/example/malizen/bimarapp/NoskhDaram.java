package com.example.malizen.bimarapp;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class NoskhDaram extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noskh_daram);


        Spinner spinner= (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.android_dropdown_arrays,R.layout.spinnertxt);
        spinner.setAdapter(adapter);


        Spinner spinner2= (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.android_dropdown_array,R.layout.spinnertxt);
        spinner2.setAdapter(adapter2);



        button = (Button) findViewById(R.id.btnn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(NoskhDaram.this);

                dialog.setContentView(R.layout.custom);
                dialog.getWindow().setLayout(1000,1300);
                dialog.setTitle("Custom Dialog");

                TextView txt = (TextView) dialog.findViewById(R.id.alertTitle);
                txt.setText("آیا از ارسال درخواست اطمینان دارید؟");

                TextView txt1 = (TextView) dialog.findViewById(R.id.AlertMassage);
                txt1.setText("کاربر گرامی در صورتی که برند خاصی از دارو که در نسخه شما وجود دارد را میخواهید حتما نام تجاری و شرکت سازنده محصول را در قسمت توضیحات قید نمایید تا دچار مشکل نشوید.");

                Button dismissButton = (Button) dialog.findViewById(R.id.abb);
                dismissButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext() ,"درخواست شما ارسال شد.", Toast.LENGTH_SHORT).show();

                        dialog.dismiss();

                    }
                });

                Button dismissButton1 = (Button) dialog.findViewById(R.id.abn);
                dismissButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext() ,"شما درخواستی ثبت نکردید.", Toast.LENGTH_SHORT).show();


                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }

}
