package chapter1.combinationandinheritance.impl;

import chapter1.combinationandinheritance.base.FlyBehavior;

/**
 * @Author: somon
 * @Date: 2017/11/22 23:10
 * @Desciption: 不会飞的行为
 * 实现变化的部分，由行为类实现接口，而不是让Duck实现，那么实际的实现不会绑死在Duck中
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
