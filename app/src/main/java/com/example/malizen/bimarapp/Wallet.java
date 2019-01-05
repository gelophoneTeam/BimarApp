package com.example.malizen.bimarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Wallet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);


        Spinner spinner= (Spinner) findViewById(R.id.spinnerw);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.price,R.layout.spinnertxtwallet);
        spinner.setAdapter(adapter);
    }
}
