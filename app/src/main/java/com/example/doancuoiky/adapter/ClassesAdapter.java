package com.example.doancuoiky.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.doancuoiky.model.Classes;

import java.util.List;

public class ClassesAdapter extends BaseAdapter {
    private Context context;
    private List<Classes> list ;

    public ClassesAdapter(Context context, List<Classes> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
