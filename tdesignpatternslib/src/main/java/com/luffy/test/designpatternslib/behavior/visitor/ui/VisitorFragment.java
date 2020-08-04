package com.luffy.test.designpatternslib.behavior.visitor.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 访问者
 */
public class VisitorFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_visitor, container, false);
    }

}
