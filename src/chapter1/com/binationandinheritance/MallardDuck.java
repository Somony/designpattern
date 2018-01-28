package chapter1.com.binationandinheritance;

import chapter1.com.binationandinheritance.impl.FlyWithWings;
import chapter1.com.binationandinheritance.impl.Quack;

/**
 * @Author: somon
 * @Date: 2017/11/22 23:43
 * @Desciption:
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        mFlyBehavior = new FlyWithWings();
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a green head duck");
    }
}
