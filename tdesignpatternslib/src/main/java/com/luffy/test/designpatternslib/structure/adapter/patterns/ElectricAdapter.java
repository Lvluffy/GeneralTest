package com.luffy.test.designpatternslib.structure.adapter.patterns;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 电能适配器（适配器角色）
 */
public class ElectricAdapter implements Motor {

    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        electricMotor = new ElectricMotor();
    }

    @Override
    public String drive() {
        return electricMotor.electricDrive();
    }
}
