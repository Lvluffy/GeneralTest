package com.luffy.test.designpatternslib.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.android.listviewlib.adapter.BaseArrayAdapter;
import com.luffy.test.designpatternslib.R;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 适配器
 */
public class DesignPatternsAdapter extends BaseArrayAdapter<DesignPatternsModel> {
    public DesignPatternsAdapter(Context context) {
        super(context);
    }

    @Override
    public View newView(Context context, DesignPatternsModel data, ViewGroup parent) {
        return LayoutInflater.from(mContext).inflate(R.layout.item_general, parent, false);
    }

    @Override
    public void bindData(View view, int position, DesignPatternsModel data) {
        TextView txtName = view.findViewById(R.id.txt_name);
        txtName.setText(data.getName());
    }
}
