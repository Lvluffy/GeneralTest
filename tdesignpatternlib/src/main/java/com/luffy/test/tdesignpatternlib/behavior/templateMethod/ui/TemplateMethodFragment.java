package com.luffy.test.tdesignpatternlib.behavior.templateMethod.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;
import com.luffy.test.tdesignpatternlib.R2;
import com.luffy.test.tdesignpatternlib.behavior.templateMethod.patterns.StudyAbroad;
import com.luffy.test.tdesignpatternlib.behavior.templateMethod.patterns.StudyInAmerica;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 模版方法
 */
public class TemplateMethodFragment extends BaseFragment {

    @BindView(R2.id.txt_study_in_america)
    TextView txtStudyInAmerica;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_template_method, container, false);
    }

    @OnClick(R2.id.btn_study_in_america)
    public void onViewClicked() {
        StudyAbroad studyAbroad = new StudyInAmerica();
        txtStudyInAmerica.setText(studyAbroad.templateMethod());
    }
}
