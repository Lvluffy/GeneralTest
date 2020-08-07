package com.luffy.test.designpatternslib.structure.proxy.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luffy.android.listviewlib.adapter.BaseArrayAdapter;
import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.structure.proxy.patterns.FenChiewKind;

public class ProxyAdapter extends BaseArrayAdapter<FenChiewKind> {

    public ProxyAdapter(Context context) {
        super(context);
    }

    @Override
    public View newView(Context context, FenChiewKind data, ViewGroup parent) {
        return LayoutInflater.from(mContext).inflate(R.layout.item_proxy, parent, false);
    }

    @Override
    public void bindData(View view, int position, FenChiewKind data) {
        ImageView imgLogo = view.findViewById(R.id.img_logo);
        TextView txtName = view.findViewById(R.id.txt_name);
        TextView txtDesc = view.findViewById(R.id.txt_desc);

        imgLogo.setImageResource(data.getLogo());
        txtName.setText(data.getName());
        txtDesc.setText(data.getDesc());
    }
}
