package com.luffy.test.android.ui.owner.thread.entrance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.android.listviewlib.adapter.BaseArrayAdapter;
import com.luffy.test.android.R;

public class ThreadAdapter extends BaseArrayAdapter<ThreadModel> {
    public ThreadAdapter(Context context) {
        super(context);
    }

    @Override
    public View newView(Context context, ThreadModel data, ViewGroup parent) {
        return LayoutInflater.from(mContext).inflate(R.layout.item_general, parent, false);
    }

    @Override
    public void bindData(View view, int position, ThreadModel data) {
        TextView txtName = view.findViewById(R.id.txt_name);
        txtName.setText(data.name);
    }
}
