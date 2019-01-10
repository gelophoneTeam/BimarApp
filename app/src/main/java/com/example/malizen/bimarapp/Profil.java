package com.example.malizen.bimarapp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

public class Profil extends AppCompatActivity {

    NumberPicker numberPicker;
    TextView age_select,height_select,weight_select;
    AlertDialog alertdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        age_select = (TextView) findViewById(R.id.age_select);
        height_select = (TextView) findViewById(R.id.height_select);
        weight_select = (TextView) findViewById(R.id.weight_select);


        age_select.setText("0");
        age_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v1 = inflater.inflate(R.layout.dialog, null);

                numberPicker = (NumberPicker) v1.findViewById(R.id.MyNunPicker2);
                numberPicker.setMaxValue(100);
                numberPicker.setMinValue(1);
                numberPicker.setValue(Integer.parseInt(age_select.getText().toString()));
                numberPicker.setWrapSelectorWheel(true);

                AlertDialog.Builder builder = new AlertDialog.Builder(
                        Profil.this);

                builder.setView( v1 );
                builder.setTitle("انتخاب سن");
                builder.setPositiveButton("تایید", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        int NumVal2 =numberPicker.getValue();


                        age_select.setText(""+  (NumVal2 ));
                    }
                });

                builder.setNegativeButton("انصراف", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        alertdialog.dismiss();

                    }
                });

                alertdialog = builder.create();
                alertdialog.show();

            }
        });

        height_select.setText("0");
        height_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v1 = inflater.inflate(R.layout.dialog, null);

                numberPicker = (NumberPicker) v1.findViewById(R.id.MyNunPicker2);
                numberPicker.setMaxValue(200);
                numberPicker.setMinValue(40);
                numberPicker.setValue(Integer.parseInt(age_select.getText().toString()));
                numberPicker.setWrapSelectorWheel(true);

                AlertDialog.Builder builder = new AlertDialog.Builder(
                        Profil.this);

                builder.setView( v1 );
                builder.setTitle("انتخاب سن");
                builder.setPositiveButton("تایید", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        int NumVal2 =numberPicker.getValue();


                        height_select.setText(""+  (NumVal2 ));
                    }
                });

                builder.setNegativeButton("انصراف", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        alertdialog.dismiss();

                    }
                });

                alertdialog = builder.create();
                alertdialog.show();

            }
        });



        weight_select.setText("0");
        weight_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v1 = inflater.inflate(R.layout.dialog, null);

                numberPicker = (NumberPicker) v1.findViewById(R.id.MyNunPicker2);
                numberPicker.setMaxValue(120);
                numberPicker.setMinValue(1);
                numberPicker.setValue(Integer.parseInt(age_select.getText().toString()));
                numberPicker.setWrapSelectorWheel(true);

                AlertDialog.Builder builder = new AlertDialog.Builder(
                        Profil.this);

                builder.setView( v1 );
                builder.setTitle("انتخاب سن");
                builder.setPositiveButton("تایید", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        int NumVal2 =numberPicker.getValue();


                        weight_select.setText(""+  (NumVal2 ));
                    }
                });

                builder.setNegativeButton("انصراف", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        alertdialog.dismiss();

                    }
                });

                alertdialog = builder.create();
                alertdialog.show();

            }
        });

        Spinner spinner= (Spinner) findViewById(R.id.gender_select);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.android_dropdown_array,R.layout.spinnertxt);
        spinner.setAdapter(adapter);


        Spinner spinner2= (Spinner) findViewById(R.id.blood_select);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.android_dropdown,R.layout.spinnertxt);
        spinner2.setAdapter(adapter2);

    }
}
