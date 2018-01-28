package chapter1.com.binationandinheritance.test;

import chapter1.com.binationandinheritance.MallardDuck;

/**
 * @Author: somon
 * @Date: 2017/11/22 23:47
 * @Desciption: 测试鸭子组合˛
 */
public class MallardDuckSimulator {
    public static void main(String [] args){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
