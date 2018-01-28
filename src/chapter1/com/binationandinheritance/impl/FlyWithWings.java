package chapter1.com.binationandinheritance.impl;

import chapter1.com.binationandinheritance.base.FlyBehavior;

/**
 * @Author: somon
 * @Date: 2017/11/22 23:09
 * @Desciption: 另一种飞的行为
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
