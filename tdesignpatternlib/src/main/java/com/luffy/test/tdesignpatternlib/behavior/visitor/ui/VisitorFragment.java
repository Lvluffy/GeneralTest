package com.luffy.test.tdesignpatternlib.behavior.visitor.ui;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;
import com.luffy.test.tdesignpatternlib.R2;
import com.luffy.test.tdesignpatternlib.behavior.visitor.patterns.ArtCompany;
import com.luffy.test.tdesignpatternlib.behavior.visitor.patterns.Company;
import com.luffy.test.tdesignpatternlib.behavior.visitor.patterns.Cuprum;
import com.luffy.test.tdesignpatternlib.behavior.visitor.patterns.Mint;
import com.luffy.test.tdesignpatternlib.behavior.visitor.patterns.Paper;
import com.luffy.test.tdesignpatternlib.behavior.visitor.patterns.SetMaterial;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 访问者
 */
public class VisitorFragment extends BaseFragment {

    @BindView(R2.id.img_result_1)
    ImageView imgResult1;
    @BindView(R2.id.img_result_2)
    ImageView imgResult2;

    SetMaterial setMaterial;
    Company visitor1;
    Company visitor2;
    String[] select;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_visitor, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setMaterial = new SetMaterial();
        setMaterial.add(new Cuprum());
        setMaterial.add(new Paper());
        visitor1 = new ArtCompany();
        visitor2 = new Mint();
    }

    @OnClick({R2.id.art, R2.id.mint})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.art) {
            select = setMaterial.accept(visitor1).split(" ");
        } else if (id == R.id.mint) {
            select = setMaterial.accept(visitor2).split(" ");
        }
        for (String s : select) {
            if (TextUtils.equals("朱熹铜像", s)) {
                imgResult1.setImageResource(R.drawable.visitor_art_cuprum);
            } else if (TextUtils.equals("讲学图", s)) {
                imgResult2.setImageResource(R.drawable.visitor_art_paper);
            } else if (TextUtils.equals("铜币", s)) {
                imgResult1.setImageResource(R.drawable.visitor_mint_cuprum);
            } else if (TextUtils.equals("纸币", s)) {
                imgResult2.setImageResource(R.drawable.visitor_mint_paper);
            }
        }
    }

}
