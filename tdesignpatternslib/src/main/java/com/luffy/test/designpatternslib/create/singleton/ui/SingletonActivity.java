package com.luffy.test.designpatternslib.create.singleton.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 单例
 */
public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new SingletonFragment());
    }
}
