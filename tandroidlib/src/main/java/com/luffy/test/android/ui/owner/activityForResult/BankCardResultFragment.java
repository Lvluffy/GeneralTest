package com.luffy.test.android.ui.owner.activityForResult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

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

        Bundle bundle = new Bundle();
        bundle.putString("name", "张三");
        bundle.putString("age", "18");
        bundle.putString("address", "北京");
        intent.putExtra("bundle", bundle);

        intent.putExtra("other", "别的数据");

        getActivity().setResult(Activity.RESULT_OK, intent);
        getActivity().finish();
    }

}
