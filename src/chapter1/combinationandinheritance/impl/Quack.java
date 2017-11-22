package chapter1.combinationandinheritance.impl;

import chapter1.combinationandinheritance.base.QuackBehavior;

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
