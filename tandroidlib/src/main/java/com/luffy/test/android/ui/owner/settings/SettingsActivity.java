package com.luffy.test.android.ui.owner.settings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name Settings
 */
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new SettingsFragment());
    }

}
