package com.luffy.test.android.ui.owner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.android.listviewlib.adapter.BaseArrayAdapter;
import com.luffy.test.android.R;

public class OwnerAdapter extends BaseArrayAdapter<OwnerModel> {

    public OwnerAdapter(Context context) {
        super(context);
    }

    @Override
    public View newView(Context context, OwnerModel data, ViewGroup parent) {
        return LayoutInflater.from(mContext).inflate(R.layout.item_general, parent, false);
    }

    @Override
    public void bindData(View view, int position, OwnerModel data) {
        TextView txtName = view.findViewById(R.id.txt_name);
        txtName.setText(data.name);
    }

}
