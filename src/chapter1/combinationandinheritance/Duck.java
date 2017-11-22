package chapter1.combinationandinheritance;

import chapter1.combinationandinheritance.base.FlyBehavior;
import chapter1.combinationandinheritance.base.QuackBehavior;

/**
 * @Author: somon
 * @Date: 2017/11/22 22:43
 * @Desciption: 定义的鸭子的基类
 * 变化和不变的东西分离：
 * 将一些不会改变的放在基类中
 * 将会改变的行为放在接口中
 */
public abstract class Duck {
     FlyBehavior mFlyBehavior;
     QuackBehavior mQuackBehavior;

    /**
     * 都会游泳，所以定义在基类中实现
     */
    public void swim() {
    }

    /**
     * 每种鸭子的外观颜色不一样，那么子类应该复写这个方法
     */
    public abstract void display();

    /*
    * 飞的行为和叫的行为每种鸭子可能会有变化，所以放在基类中不合适
    * 改变一发牵动全部，造成其他不想要的改变
    * 所以应该分离出去
    fly();
    quack();
    */

    /**
     * 委托给FlyBehavior进行行为
     */
    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    //其他的方法
}
