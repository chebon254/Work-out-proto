package com.example.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WorkOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out);
        getSupportActionBar().hide();


        ListView myListView = findViewById(R.id.mylistview);

        final ArrayList<String> myFamily =new ArrayList<String>();

        myFamily.add("Day 1");
        myFamily.add("Day 2");
        myFamily.add("Day 3");
        myFamily.add("Day 4");
        myFamily.add("Day 5");
        myFamily.add("Day 6");
        myFamily.add("Day 7");
        myFamily.add("Day 8");
        myFamily.add("Day 9");
        myFamily.add("Day 10");
        myFamily.add("Day 11");
        myFamily.add("Day 12");
        myFamily.add("Day 13");
        myFamily.add("Day 14");
        myFamily.add("Day 15");
        myFamily.add("Day 16");
        myFamily.add("Day 17");
        myFamily.add("Day 18");
        myFamily.add("Day 19");
        myFamily.add("Day 20");
        myFamily.add("Day 21");
        myFamily.add("Day 22");
        myFamily.add("Day 23");
        myFamily.add("Day 24");
        myFamily.add("Day 25");
        myFamily.add("Day 26");
        myFamily.add("Day 27");
        myFamily.add("Day 28");
        myFamily.add("Day 29");
        myFamily.add("Day 30");


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Person tabbed",myFamily.get(position));
            }
        });

        //display this names in listview array adapter used to display content to our list iew

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter);

    }
}
