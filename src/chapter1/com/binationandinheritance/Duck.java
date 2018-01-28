package chapter1.com.binationandinheritance;

import chapter1.com.binationandinheritance.base.FlyBehavior;
import chapter1.com.binationandinheritance.base.QuackBehavior;

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
     * 无需子类改变
     */
    public void swim() {
        System.out.println("all of duck can swim");
    }

    /**
     * 每种鸭子的外观颜色不一样，那么子类都应该复写这个方法
     */
    public abstract void display();

    /*
    * 飞的行为和叫的行为部分鸭子鸭子可能相同，部分会不一样，
    * 1.要是放在基类中写一种实现，让子类根据自己的情况去复写，那么就会有很多子类必须更改，更对于不需要基类行为的子类造成困扰，改变一发牵动全部，造成其他不想要的改变
    * 2.要是abstract，那么每个子类都必须实现，造成一部分相同行为的子类中存在相同的代码
    *
    * 所以应该分离出去
 void  abstract fly();
 void  abstract  quack();
    */

    /**
     * fly委托给FlyBehavior进行行为，那么duck也不用关心实现细节
     */
    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    /**
     * 如果只是委托，那么子类必须在构造函数中初始化mFlyBehavior对象，这样在一开始就定死了子类的行为
     * 那么应该添加一个动态设定行为的方法
     * <p>
     * 动态设定鸭子子类的行为
     */
    void setFlyBehavior(FlyBehavior fb) {
        mFlyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior qb) {
        mQuackBehavior = qb;
    }

    //其他的方法
    /*doXXX();*/
}
