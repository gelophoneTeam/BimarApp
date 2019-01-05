package com.example.malizen.bimarapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class Adapter extends BaseAdapter {

        String [] result;
        Context context;
        int [] imageId;
private static LayoutInflater inflater=null;
public Adapter(History history, String[] osNameList, int[] osImages) {
        result=osNameList;
        context=history;
        imageId=osImages;
        inflater = ( LayoutInflater )context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

@Override
public int getCount() {
        return result.length;
        }

@Override
public Object getItem(int position) {
        return position;
        }

@Override
public long getItemId(int position) {
        return position;
        }



public class Holder
{
    TextView os_text;
    ImageView os_img;
}
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.listorder, null);
        holder.os_text =(TextView) rowView.findViewById(R.id.txth);
        holder.os_img =(ImageView) rowView.findViewById(R.id.imageViewh);

        holder.os_text.setText(result[position]);
        holder.os_img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_SHORT).show();
            }
        });

        return rowView; }

}