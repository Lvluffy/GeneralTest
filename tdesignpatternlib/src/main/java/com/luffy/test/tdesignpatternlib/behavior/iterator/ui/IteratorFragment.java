package com.luffy.test.tdesignpatternlib.behavior.iterator.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;
import com.luffy.test.tdesignpatternlib.R2;
import com.luffy.test.tdesignpatternlib.behavior.iterator.patterns.ViewSpot;
import com.luffy.test.tdesignpatternlib.behavior.iterator.patterns.ViewSpotIterator;
import com.luffy.test.tdesignpatternlib.behavior.iterator.patterns.ViewSpotSet;
import com.luffy.test.tdesignpatternlib.behavior.iterator.patterns.WyViewSpotSet;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 迭代器
 */
public class IteratorFragment extends BaseFragment {

    @BindView(R2.id.txt_result)
    TextView txtResult;

    ViewSpotSet viewSpotSet; //婺源景点集接口
    ViewSpotIterator iterator; //婺源景点迭代器接口

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_iterator, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewSpotSet = new WyViewSpotSet();
        viewSpotSet.add(new ViewSpot("江湾", "江湾景区是婺源的一个国家5A级旅游景区，景区内有萧江宗祠、永思街、滕家老屋、婺源人家、乡贤园、百工坊等一大批古建筑，精美绝伦，做工精细。"));
        viewSpotSet.add(new ViewSpot("李坑", "李坑村是一个以李姓聚居为主的古村落，是国家4A级旅游景区，其建筑风格独特，是著名的徽派建筑，给人一种安静、祥和的感觉。"));
        viewSpotSet.add(new ViewSpot("思溪延村", "思溪延村位于婺源县思口镇境内，始建于南宋庆元五年（1199年），当时建村者俞氏以（鱼）思清溪水而名。"));
        viewSpotSet.add(new ViewSpot("晓起村", "晓起有“中国茶文化第一村”与“国家级生态示范村”之美誉，村屋多为清代建筑，风格各具特色，村中小巷均铺青石，曲曲折折，回环如棋局。"));
        viewSpotSet.add(new ViewSpot("菊径村", "菊径村形状为山环水绕型，小河成大半圆型，绕村庄将近一周，四周为高山环绕，符合中国的八卦“后山前水”设计，当地人称“脸盆村”。"));
        viewSpotSet.add(new ViewSpot("篁岭", "篁岭是著名的“晒秋”文化起源地，也是一座距今近六百历史的徽州古村；篁岭属典型山居村落，民居围绕水口呈扇形梯状错落排布。"));
        viewSpotSet.add(new ViewSpot("彩虹桥", "彩虹桥是婺源颇有特色的带顶的桥——廊桥，其不仅造型优美，而且它可在雨天里供行人歇脚，其名取自唐诗“两水夹明镜，双桥落彩虹”。"));
        viewSpotSet.add(new ViewSpot("卧龙谷", "卧龙谷是国家4A级旅游区，这里飞泉瀑流泄银吐玉、彩池幽潭碧绿清新、山峰岩石挺拔奇巧，活脱脱一幅天然泼墨山水画。"));
        iterator = viewSpotSet.getIterator(); //获取婺源景点迭代器
    }

    @OnClick({R2.id.first, R2.id.previous, R2.id.next, R2.id.last})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.first) {
            txtResult.setText(iterator.first().getIntroduce());
        } else if (id == R.id.previous) {
            txtResult.setText(iterator.previous().getIntroduce());
        } else if (id == R.id.next) {
            txtResult.setText(iterator.next().getIntroduce());
        } else if (id == R.id.last) {
            txtResult.setText(iterator.last().getIntroduce());
        }
    }
}
