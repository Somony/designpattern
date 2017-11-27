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
   abstract fly();
   abstract  quack();
    */

    /**
     * 委托给FlyBehavior进行行为
     * 如果只是委托，那么子类必须在构造函数中初始化mFlyBehavior对象，这样在一开始就定死了子类的行为
     * 那么应该添加一个动态设定行为的方法
     */
    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    /**
     * 动态设定鸭子子类的行为
     */
    void setFlyBehavior(FlyBehavior fb) {
        mFlyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior qb) {
        mQuackBehavior = qb;
    }

    //其他的方法
}
