package com.example.dlarb.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    public ArrayList<String> items = new ArrayList<>();



    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        TextView content = v.findViewById(R.id.content);
        TextView sub = v.findViewById(R.id.sub);
        content.setText(items.get(i));
        sub.setText(i+"번째 아이템입니다.");
        Log.d("TAG-NG",i+"번째 아이템을 생성합니다.");
        return v;
    }
}
