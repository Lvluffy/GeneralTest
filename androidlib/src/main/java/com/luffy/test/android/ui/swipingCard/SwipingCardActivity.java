package com.luffy.test.android.ui.swipingCard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.utils.Coder;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-07-03
 *
 * @name 刷卡
 */
public class SwipingCardActivity extends AppCompatActivity {

    public static final String ACTION_TRANSACTION = "com.miui.nfc.action.TRANSACTION";

    public static final String EXTRAS_TRANSACTION_AID = "com.miui.nfc.extras.AID";
    public static final String EXTRAS_TRANSACTION_DATA = "com.miui.nfc.extras.DATA";


    private String mainAid = "5943542E555345525800022058100000";
    private String mainData = "";

    private String memberAid = "A0000006320101065800022058100000";
    private String memberData = "";

    private String otherAid = "A00000063201010511215449414E4A49";
    private String otherData = "02029000090000000000000BB83000890001950200C18027017D0101000000000000065292011000000001011000FFFFFFFF000000000000000010007513090008190000000000000000100075131F081909000000000000000020190831175904000000000000000000038408000000000000000BB8000000000100000000000000000000000000000000000000000000000000000000E13003000030008900019501080013003000000000000000000BB820190831175904100001011000FFFFFFFF000000000000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiping_card);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.btn_main,
            R2.id.btn_member,
            R2.id.btn_other
    })
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_main) {
            start(mainAid, mainData);
        } else if (id == R.id.btn_member) {
            start(memberAid, memberData);
        } else if (id == R.id.btn_other) {
            start(otherAid, otherData);
        }
    }

    private void start(String aid, String data) {
        Intent intent = new Intent(ACTION_TRANSACTION);
        intent.setPackage("com.miui.tsmclient");
        intent.putExtra(EXTRAS_TRANSACTION_AID, Coder.hexStringToBytes(aid));
        intent.putExtra(EXTRAS_TRANSACTION_DATA, Coder.hexStringToBytes(data));
        startService(intent);
    }


}
