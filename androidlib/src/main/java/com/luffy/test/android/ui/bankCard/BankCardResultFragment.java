package com.luffy.test.android.ui.bankCard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.ui.base.BaseFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class BankCardResultFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bank_card_result, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onStop() {
        Intent intent = new Intent();
        intent.putExtra("data", "我是传回来的数据");
        getActivity().setResult(Activity.RESULT_OK, intent);
        super.onStop();
    }

    @OnClick(R2.id.btn)
    public void onViewClicked() {
        getActivity().onBackPressed();
    }

    public void handler() {
        Intent intent = new Intent();
        intent.putExtra("data", "我是传回来的数据");
        getActivity().setResult(Activity.RESULT_OK, intent);
    }

}
