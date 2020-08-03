package com.luffy.test.android.ui.owner.activityForResult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseFragment;

import butterknife.OnClick;

public class BankCardResultFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bank_card_result, container, false);
    }

    @OnClick(R2.id.btn)
    public void onViewClicked() {
        doFinish();
    }

    void doFinish() {
        Intent intent = new Intent();
        intent.putExtra("data", "我是传回来的数据");
        getActivity().setResult(Activity.RESULT_OK, intent);
        getActivity().finish();
    }

}
