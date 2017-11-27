package chapter1.combinationandinheritance.test;

import chapter1.combinationandinheritance.MiniDuck;

/**
 * @Author: somon
 * @Date: 2017/11/27 23:04
 * @Desciption:
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        MiniDuck miniDuck = new MiniDuck();
        miniDuck.display();
        miniDuck.performFly();
        miniDuck.performQuack();

        miniDuck.grow();
        miniDuck.performFly();
    }
}
