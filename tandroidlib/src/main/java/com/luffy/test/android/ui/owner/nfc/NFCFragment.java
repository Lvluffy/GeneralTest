package com.luffy.test.android.ui.owner.nfc;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.utils.generallib.NfcUtils;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-26
 *
 * @name
 */
public class NFCFragment extends BaseFragment {

    @BindView(R2.id.txt_is_support_nfc)
    TextView txtIsSupportNfc;
    @BindView(R2.id.txt_has_open_nfc)
    TextView txtHasOpenNfc;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nfc, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtIsSupportNfc.setText(getString(R.string.format_nfc_is_support, NfcUtils.getInstance(mContext).isSupportNfc() + ""));
        txtHasOpenNfc.setText(getString(R.string.format_nfc_has_open, NfcUtils.getInstance(mContext).hasOpenNfc() + ""));
    }

    @OnClick({R2.id.btn_open_nfc, R2.id.btn_close_nfc})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_open_nfc) {
            NfcUtils.getInstance(mContext).openNfc();
            txtHasOpenNfc.setText(getString(R.string.format_nfc_has_open, NfcUtils.getInstance(mContext).hasOpenNfc() + ""));
        } else if (id == R.id.btn_close_nfc) {
            NfcUtils.getInstance(mContext).closeNfc();
            txtHasOpenNfc.setText(getString(R.string.format_nfc_has_open, NfcUtils.getInstance(mContext).hasOpenNfc() + ""));
        }
    }

}
