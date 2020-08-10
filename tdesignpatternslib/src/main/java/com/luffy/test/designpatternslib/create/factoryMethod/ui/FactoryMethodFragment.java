package com.luffy.test.designpatternslib.create.factoryMethod.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.R2;
import com.luffy.test.designpatternslib.create.factoryMethod.patterns.Animal;
import com.luffy.test.designpatternslib.create.factoryMethod.patterns.AnimalFarm;
import com.luffy.test.designpatternslib.create.factoryMethod.patterns.CattleFarm;
import com.luffy.test.designpatternslib.create.factoryMethod.patterns.HorseFarm;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 工厂方法
 */
public class FactoryMethodFragment extends BaseFragment {

    @BindView(R2.id.txt_display_horse)
    TextView txtDisplayHorse;
    @BindView(R2.id.txt_display_cattle)
    TextView txtDisplayCattle;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_factory_method, container, false);
    }

    @OnClick({R2.id.btn_create_horse,
            R2.id.btn_create_cattle})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_create_horse) {
            createHorse();
        } else if (id == R.id.btn_create_cattle) {
            createCattle();
        }
    }

    private void createHorse() {
        AnimalFarm animalFarm = new HorseFarm();
        Animal animal = animalFarm.createAnimal();
        txtDisplayHorse.setText(animal.show());
    }

    private void createCattle() {
        AnimalFarm animalFarm = new CattleFarm();
        Animal animal = animalFarm.createAnimal();
        txtDisplayCattle.setText(animal.show());
    }
}
