package com.luffy.test.designpatternslib.behavior.iterator.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 迭代器
 */
public class IteratorFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_iterator, container, false);
    }

}
