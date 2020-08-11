package com.luffy.test.tdesignpatternlib.structure.composite.ui;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;
import com.luffy.test.tdesignpatternlib.R2;
import com.luffy.test.tdesignpatternlib.structure.composite.patterns.Bags;
import com.luffy.test.tdesignpatternlib.structure.composite.patterns.Goods;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 组合
 */
public class CompositeFragment extends BaseFragment {

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_composite, container, false);
    }

    @OnClick(R2.id.btn_show)
    public void onViewClicked() {
        display();
    }

    private void display() {
        //红色小袋子
        Bags redSmallBag = new Bags();
        redSmallBag.add(new Goods("婺源特产", 2, 7.9f));
        redSmallBag.add(new Goods("婺源地图", 1, 9.9f));
        //白色小袋子
        Bags whiteSmallBag = new Bags();
        whiteSmallBag.add(new Goods("韶关香菇", 2, 68));
        whiteSmallBag.add(new Goods("韶关红茶", 3, 180));
        //中袋子
        Bags mediumBag = new Bags();
        mediumBag.add(new Goods("景德镇瓷器", 1, 380));
        mediumBag.add(redSmallBag);
        //大袋子
        Bags bigBag = new Bags();
        bigBag.add(new Goods("李宁牌运动鞋", 1, 198));
        bigBag.add(whiteSmallBag);
        bigBag.add(mediumBag);
        //显示
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("您选购的商品有：\n").append(bigBag.show());
        stringBuilder.append("要支付的总价是：").append(bigBag.calculation()).append("元");
        Log.d(TAG, stringBuilder.toString());
        txtContent.setText(stringBuilder.toString());
    }
}
