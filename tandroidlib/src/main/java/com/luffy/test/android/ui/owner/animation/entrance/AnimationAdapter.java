package com.luffy.test.android.ui.owner.animation.entrance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.android.listviewlib.adapter.BaseArrayAdapter;
import com.luffy.test.android.R;

public class AnimationAdapter extends BaseArrayAdapter<AnimationModel> {
    public AnimationAdapter(Context context) {
        super(context);
    }

    @Override
    public View newView(Context context, AnimationModel data, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_animation, parent, false);
    }

    @Override
    public void bindData(View view, int position, AnimationModel data) {
        TextView txtName = view.findViewById(R.id.txt_name);
        txtName.setText(data.getName());
    }
}
