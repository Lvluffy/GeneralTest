package com.luffy.test.designpatternslib.structure.facade.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luffy.android.listviewlib.adapter.BaseArrayAdapter;
import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.structure.facade.patterns.ImageIcon;

public class FacadeAdapter extends BaseArrayAdapter<ImageIcon> {

    public FacadeAdapter(Context context) {
        super(context);
    }

    @Override
    public View newView(Context context, ImageIcon data, ViewGroup parent) {
        return LayoutInflater.from(mContext).inflate(R.layout.item_facade, parent, false);
    }

    @Override
    public void bindData(View view, int position, ImageIcon data) {
        ImageView imgLogo = view.findViewById(R.id.img_logo);
        TextView txtName = view.findViewById(R.id.txt_name);

        imgLogo.setImageResource(data.getImage());
        txtName.setText(data.getName());
    }
}
