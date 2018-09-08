package com.example.dlarb.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView list;
    ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        list = findViewById(R.id.list);
        mAdapter = new ListAdapter();
        list.setAdapter(mAdapter);

        for(int a=0;a<100;a++){
            mAdapter.items.add(a+"asd");
        }




    }
}
