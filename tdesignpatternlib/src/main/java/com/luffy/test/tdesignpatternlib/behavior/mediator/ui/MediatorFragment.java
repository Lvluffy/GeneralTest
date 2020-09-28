package com.luffy.test.tdesignpatternlib.behavior.mediator.ui;


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
import com.luffy.test.tdesignpatternlib.behavior.mediator.patterns.Buyer;
import com.luffy.test.tdesignpatternlib.behavior.mediator.patterns.Customer;
import com.luffy.test.tdesignpatternlib.behavior.mediator.patterns.EstateMedium;
import com.luffy.test.tdesignpatternlib.behavior.mediator.patterns.Medium;
import com.luffy.test.tdesignpatternlib.behavior.mediator.patterns.Seller;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 中介者
 */
public class MediatorFragment extends BaseFragment {

    @BindView(R2.id.edit)
    EditText edit;
    @BindView(R2.id.txt_result)
    TextView txtResult;

    Medium medium;
    Customer seller;
    Customer buyer;

    StringBuilder sb = new StringBuilder();

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mediator, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        medium = new EstateMedium();
        seller = new Seller("张三(卖方)");
        buyer = new Buyer("李四(买方)");
        medium.register(seller);
        medium.register(buyer);
    }

    @OnClick({R2.id.seller, R2.id.buyer})
    public void onViewClicked(View view) {
        if (edit.getText().toString().isEmpty()) {
            Toast.makeText(mContext, edit.getHint(), Toast.LENGTH_SHORT).show();
            return;
        }
        int id = view.getId();
        if (id == R.id.seller) {
            sb.append(seller.send(edit.getText().toString()));
        } else if (id == R.id.buyer) {
            sb.append(buyer.send(edit.getText().toString()));
        }
        txtResult.setText(sb.toString());
    }
}
