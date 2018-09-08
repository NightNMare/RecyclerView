package com.example.dlarb.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    Button btn_RV;
    Button btn_LV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn_LV = findViewById(R.id.listview);
        btn_RV = findViewById(R.id.recyclerview);

        btn_LV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(FirstActivity.this, ListViewActivity.class);
                startActivity(list);
            }
        });
        btn_RV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recycle = new Intent(FirstActivity.this, com.example.dlarb.recyclerview.RecyclerView.class);
                startActivity(recycle);
            }
        });


    }
}
