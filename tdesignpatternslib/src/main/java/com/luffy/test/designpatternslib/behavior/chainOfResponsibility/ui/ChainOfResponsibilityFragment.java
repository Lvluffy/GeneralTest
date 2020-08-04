package com.luffy.test.designpatternslib.behavior.chainOfResponsibility.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.R2;
import com.luffy.test.designpatternslib.behavior.chainOfResponsibility.patterns.Handler;
import com.luffy.test.designpatternslib.behavior.chainOfResponsibility.patterns.HandlerBoss;
import com.luffy.test.designpatternslib.behavior.chainOfResponsibility.patterns.HandlerDirector;
import com.luffy.test.designpatternslib.behavior.chainOfResponsibility.patterns.HandlerGroupLeader;
import com.luffy.test.designpatternslib.behavior.chainOfResponsibility.patterns.HandlerManager;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 责任链
 */
public class ChainOfResponsibilityFragment extends BaseFragment {

    @BindView(R2.id.txt_content)
    TextView txtContent;
    @BindView(R2.id.edit)
    EditText edit;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chain_of_responsibility, container, false);
    }

    @OnClick(R2.id.btn_execute)
    public void onViewClicked() {
        if (edit.getText().toString().length() == 0) {
            Toast.makeText(mContext, "请输入请假天数", Toast.LENGTH_SHORT).show();
            return;
        }
        Handler handler1 = new HandlerGroupLeader();
        Handler handler2 = new HandlerDirector();
        Handler handler3 = new HandlerManager();
        Handler handler4 = new HandlerBoss();
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler3.setHandler(handler4);
        txtContent.setText(handler1.handleRequest(Integer.parseInt(edit.getText().toString())));
    }
}
