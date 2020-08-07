package com.luffy.test.designpatternslib.create.builder.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.R2;
import com.luffy.test.designpatternslib.create.builder.patterns.No1Decorator;
import com.luffy.test.designpatternslib.create.builder.patterns.No2Decorator;
import com.luffy.test.designpatternslib.create.builder.patterns.Parlour;
import com.luffy.test.designpatternslib.create.builder.patterns.ProjectManager;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 建造者
 */
public class BuilderFragment extends BaseFragment {

    @BindView(R2.id.txt_no1_decorator)
    TextView txtNo1Decorator;
    @BindView(R2.id.txt_no2_decorator)
    TextView txtNo2Decorator;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_builder, container, false);
    }

    @OnClick({R2.id.btn_no1_decorator, R2.id.btn_no2_decorator})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_no1_decorator) {
            no1Decorator();
        } else if (id == R.id.btn_no2_decorator) {
            no2Decorator();
        }
    }

    private void no1Decorator() {
        ProjectManager projectManager = new ProjectManager(new No1Decorator());
        Parlour parlour = projectManager.decorate();
        txtNo1Decorator.setText(parlour.toString());

    }

    private void no2Decorator() {
        ProjectManager projectManager = new ProjectManager(new No2Decorator());
        Parlour parlour = projectManager.decorate();
        txtNo2Decorator.setText(parlour.toString());
    }


}
