package com.luffy.test.tdesignpatternlib.behavior.iterator.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 迭代器
 */
public class IteratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new IteratorFragment());
    }
}
