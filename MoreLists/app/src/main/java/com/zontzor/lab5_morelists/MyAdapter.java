package com.zontzor.lab5_morelists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter{

    public MyAdapter(Context context, ArrayList countries) {
        super(context, R.layout.mylist, countries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View theView = convertView;

        if(theView == null) {
            LayoutInflater theInflater = LayoutInflater.from(getContext());
            theView = theInflater.inflate(R.layout.mylist, parent, false);
        }

        String country = (String) getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.itemName);
        theTextView.setText(country);

        ImageView theImageView = (ImageView) theView.findViewById(R.id.icon);
        if (country.equals("Ireland")) {
            theImageView.setImageResource(R.mipmap.argentina_flag);
        } else {
            theImageView.setImageResource(R.mipmap.ok_tick);
        }


        return theView;
    }
}
