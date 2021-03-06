package com.zontzor.lab5_morelists;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Ireland");
        countries.add("Sri Lanka");
        countries.add("Saudi Arabia");
        countries.add("China");
        countries.add("Sealand");
        countries.add("Christmas Island");
        countries.add("DRPK");

        ListAdapter basicAdapter = new MyAdapter(this,countries);
        setListAdapter(basicAdapter);
    }

    public void onListItemClick(ListView list, View v, int position, long id) {
        String selection = list.getItemAtPosition(position).toString();
        Intent myNewActivity = new Intent(MainActivity.this, Country.class);
        myNewActivity.putExtra("Country", selection);
        myNewActivity.putExtra("Position", position);
        startActivity(myNewActivity);
    }
}
