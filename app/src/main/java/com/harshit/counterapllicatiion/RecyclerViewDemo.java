package com.harshit.counterapllicatiion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewDemo extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<ListItem> list = new ArrayList<>();
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);
        recyclerView = findViewById(R.id.recycle);

        list.add(new ListItem("Monday"));
        list.add(new ListItem("Tuesday"));
        list.add(new ListItem("wednesday"));
        list.add(new ListItem("Thursday"));
        list.add(new ListItem("Friday"));
        list.add(new ListItem("Sat."));
        list.add(new ListItem("Sun"));

        recyclerAdapter = new RecyclerAdapter(list,getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

    }
}