package com.luffy.test.tdesignpatternlib.behavior.command.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;
import com.luffy.test.tdesignpatternlib.R2;
import com.luffy.test.tdesignpatternlib.behavior.command.patterns.ChangFen;
import com.luffy.test.tdesignpatternlib.behavior.command.patterns.HeFen;
import com.luffy.test.tdesignpatternlib.behavior.command.patterns.HunDun;
import com.luffy.test.tdesignpatternlib.behavior.command.patterns.Waiter;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 命令
 */
public class CommandFragment extends BaseFragment {

    @BindView(R2.id.img_chang_fen)
    ImageView imgChangFen;
    @BindView(R2.id.img_hun_dun)
    ImageView imgHunDun;
    @BindView(R2.id.img_he_fen)
    ImageView imgHeFen;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_command, container, false);
    }

    @OnClick({R2.id.btn_chang_fen, R2.id.btn_hun_dun, R2.id.btn_he_fen})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_chang_fen) {
            changFen();
        } else if (id == R.id.btn_hun_dun) {
            hunDun();
        } else if (id == R.id.btn_he_fen) {
            heFen();
        }
    }

    private void changFen() {
        Waiter waiter = new Waiter();
        waiter.setChangFen(new ChangFen());
        imgChangFen.setImageResource(waiter.chooseChangFen());
    }

    private void hunDun() {
        Waiter waiter = new Waiter();
        waiter.setHunDun(new HunDun());
        imgHunDun.setImageResource(waiter.chooseHunDun());
    }

    private void heFen() {
        Waiter waiter = new Waiter();
        waiter.setHeFen(new HeFen());
        imgHeFen.setImageResource(waiter.chooseHeFen());
    }
}
