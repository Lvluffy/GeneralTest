package com.luffy.test.tdesignpatternlib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.android.listviewlib.adapter.BaseArrayAdapter;

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
        txtName.setText(mContext.getString(data.name));
        txtName.setEnabled(data.support);
    }
}
