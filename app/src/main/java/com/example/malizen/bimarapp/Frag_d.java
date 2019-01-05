package com.example.malizen.bimarapp;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_d extends Fragment {


    public Frag_d() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag_d,container,false);


        Button mButton = (Button) view.findViewById(R.id.btn1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent intent = new Intent(getActivity(), Index.class);
//                startActivity(intent);


            }
        });


        TextView txt = (TextView) view.findViewById(R.id.txt1);
        TextView txt1 = (TextView) view.findViewById(R.id.txt2);
        Button btn = (Button) view.findViewById(R.id.btn1);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/IRANSansWeb(FaNum).ttf");
        txt.setTypeface(font);
        txt1.setTypeface(font);
        return view; }
}

