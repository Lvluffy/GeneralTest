package com.luffy.test.tdesignpatternlib.behavior.observer.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 观察者
 */
public class ObserverFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_observer, container, false);
    }

}
