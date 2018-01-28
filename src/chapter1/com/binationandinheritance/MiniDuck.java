package chapter1.com.binationandinheritance;

import chapter1.com.binationandinheritance.impl.FlyNoWay;
import chapter1.com.binationandinheritance.impl.FlyWithWings;
import chapter1.com.binationandinheritance.impl.Quack;

/**
 * @Author: somon
 * @Date: 2017/11/27 22:58
 * @Desciption: 小鸭，先不会飞，但是长大了会
 */
public class MiniDuck extends Duck {

    public MiniDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a little yellow duck");
    }

    public void grow() {
        System.out.println("now,I am grow to a big yellow duck");
        //动态设置行为
        setFlyBehavior(new FlyWithWings());
    }
}