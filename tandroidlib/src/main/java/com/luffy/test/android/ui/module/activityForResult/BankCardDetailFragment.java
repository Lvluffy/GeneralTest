package com.luffy.test.android.ui.module.activityForResult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.utils.generallib.BundleUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class BankCardDetailFragment extends BaseFragment {

    public static final int REQUEST_CODE = 1;

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bank_card_detail, container, false);
    }

    @OnClick(R2.id.btn)
    public void onViewClicked() {
        Intent intent = new Intent(getActivity(), BankCardResultActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "" + BundleUtils.getInstance().bundleToString(data.getExtras()));
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE) {
            txtContent.setText(data.getStringExtra("data"));
        }
    }
}
