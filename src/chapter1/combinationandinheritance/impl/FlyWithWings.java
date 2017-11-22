package chapter1.combinationandinheritance.impl;

import chapter1.combinationandinheritance.base.FlyBehavior;

/**
 * @Author: somon
 * @Date: 2017/11/22 23:09
 * @Desciption: 飞的行为
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
