package chapter1.com.binationandinheritance.impl;

import chapter1.com.binationandinheritance.base.QuackBehavior;

/**
 * @Author: somon
 * @Date: 2017/11/22 23:42
 * @Desciption:
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can yaya");
    }
}
