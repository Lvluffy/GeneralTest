package com.luffy.generaltest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.android.listviewlib.adapter.BaseArrayAdapter;

public class MainAdapter extends BaseArrayAdapter<MainModel> {
    public MainAdapter(Context context) {
        super(context);
    }

    @Override
    public View newView(Context context, MainModel data, ViewGroup parent) {
        return LayoutInflater.from(mContext).inflate(R.layout.item_general, parent, false);
    }

    @Override
    public void bindData(View view, int position, MainModel data) {
        TextView txtName = view.findViewById(R.id.txt_name);
        txtName.setText(data.name);
    }
}
