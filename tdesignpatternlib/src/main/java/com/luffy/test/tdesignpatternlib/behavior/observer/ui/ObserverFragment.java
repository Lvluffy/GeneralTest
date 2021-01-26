package com.luffy.test.tdesignpatternlib.behavior.observer.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;
import com.luffy.test.tdesignpatternlib.R2;
import com.luffy.test.tdesignpatternlib.behavior.observer.patterns.Company;
import com.luffy.test.tdesignpatternlib.behavior.observer.patterns.ExportCompany;
import com.luffy.test.tdesignpatternlib.behavior.observer.patterns.ImportCompany;
import com.luffy.test.tdesignpatternlib.behavior.observer.patterns.RMBRate;
import com.luffy.test.tdesignpatternlib.behavior.observer.patterns.Rate;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 观察者
 */
public class ObserverFragment extends BaseFragment {

    @BindView(R2.id.edit)
    EditText edit;
    @BindView(R2.id.txt_result)
    TextView txtResult;

    Rate rate;
    Company importCompany;
    Company exportCompany;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_observer, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rate = new RMBRate();
        importCompany = new ImportCompany();
        exportCompany = new ExportCompany();
        rate.add(importCompany);
        rate.add(exportCompany);
    }

    @OnClick({R2.id.appreciation, R2.id.devaluation})
    public void onViewClicked(View view) {
        if (edit.getText().toString().isEmpty()) {
            Toast.makeText(mContext, "请输入数字", Toast.LENGTH_SHORT).show();
            return;
        }
        int basisPoints = Integer.valueOf(edit.getText().toString());
        int id = view.getId();
        if (id == R.id.appreciation) {
            txtResult.setText(rate.notify(basisPoints));
        } else if (id == R.id.devaluation) {
            txtResult.setText(rate.notify(-basisPoints));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        rate.remove(importCompany);
        rate.remove(exportCompany);
    }
}
