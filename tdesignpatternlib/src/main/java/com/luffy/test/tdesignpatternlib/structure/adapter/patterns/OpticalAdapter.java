package com.luffy.test.tdesignpatternlib.structure.adapter.patterns;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 光能适配器（适配器角色）
 */
public class OpticalAdapter implements Motor {

    private OpticalMotor opticalMotor;

    public OpticalAdapter() {
        opticalMotor = new OpticalMotor();
    }

    @Override
    public String drive() {
        return opticalMotor.opticalDrive();
    }
}
