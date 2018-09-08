package com.example.dlarb.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    android.support.v7.widget.RecyclerView RV;
    RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RV = findViewById(R.id.recycler_view);
        mAdapter = new RecyclerAdapter();

        RV.setAdapter(mAdapter);
        RV.setLayoutManager(new LinearLayoutManager(this));
        for(int i =0;i<100;i++){
            mAdapter.items.add(i+"asd");
        }

    }
}
