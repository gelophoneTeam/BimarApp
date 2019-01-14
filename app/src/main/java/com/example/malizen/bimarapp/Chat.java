package com.example.malizen.bimarapp;

import android.content.Intent;
import android.database.DataSetObserver;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

public class Chat extends AppCompatActivity {

    private static final String TAG = "ChatActivity";
    private ChatArrayAdapter adp;
    private ListView list;
    private EditText chatText;
    private ImageView send,camera;
    Intent intent;
    private boolean side = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);


        Intent i = getIntent();


        camera=(ImageView)findViewById(R.id.camera);
        send = (ImageView) findViewById(R.id.img);
        list = (ListView) findViewById(R.id.listview);
        chatText = (EditText) findViewById(R.id.editText);

        adp = new ChatArrayAdapter(getApplicationContext(), R.layout.activity_chat_message);
        list.setAdapter(adp);




        chatText.setOnKeyListener(new View.OnKeyListener() {

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    return sendChatMessage();
                }
                return false;

            }

        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });

        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                sendChatMessage();
            }
        });


        list.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        list.setAdapter(adp);


        adp.registerDataSetObserver(new DataSetObserver() {



            public void OnChanged(){


                super.onChanged();


                list.setSelection(adp.getCount() -1);




            }



        });


    }


    private boolean sendChatMessage(){

        adp.add(new ChatMessage(side, chatText.getText().toString()));

        chatText.setText("");

        side = !side;

        return true;
    }

}
