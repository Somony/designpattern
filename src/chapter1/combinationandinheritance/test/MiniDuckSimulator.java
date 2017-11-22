package chapter1.combinationandinheritance.test;

import chapter1.combinationandinheritance.MallardDuck;

/**
 * @Author: somon
 * @Date: 2017/11/22 23:47
 * @Desciption: 测试鸭子组合
 */
public class MiniDuckSimulator {
    public static void main(String [] args){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
