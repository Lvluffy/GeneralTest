package com.luffy.test.android.ui.bankCard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.ui.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BankCardDetailFragment extends BaseFragment {

    public static final int REQUEST_CODE = 1;

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bank_card_detail, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick(R2.id.btn)
    public void onViewClicked() {
        Intent intent = new Intent(getActivity(), BankCardResultActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE) {
            txtContent.setText(data.getStringExtra("data"));
        }
    }
}
