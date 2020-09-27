package com.luffy.test.tdesignpatternlib.behavior.state.ui;


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
import com.luffy.test.tdesignpatternlib.behavior.state.patterns.ScoreContext;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 状态
 */
public class StateFragment extends BaseFragment {

    @BindView(R2.id.edit)
    EditText edit;
    @BindView(R2.id.txt_result)
    TextView txtResult;

    ScoreContext account;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_state, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        account = new ScoreContext();
    }

    @OnClick({R2.id.add, R2.id.subtract})
    public void onViewClicked(View view) {
        if (edit.getText().toString().isEmpty()) {
            Toast.makeText(mContext, "请输入数字", Toast.LENGTH_SHORT).show();
            return;
        }
        int score = Integer.valueOf(edit.getText().toString());
        int id = view.getId();
        if (id == R.id.add) {
            txtResult.setText(account.add(score));
        } else if (id == R.id.subtract) {
            txtResult.setText(account.subtract(score));
        }
    }
}
