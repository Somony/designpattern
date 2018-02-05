package chapter2.com.observerpattern.push.impl;


import chapter2.com.observerpattern.push.base.DisplayElement;
import chapter2.com.observerpattern.push.base.Observer;
import chapter2.com.observerpattern.push.base.Subject;

/**
 * @Author: somon
 * @Date: 2018/2/2 16:16
 * @Desciption: Observer的具体子类，收到Subject中更新的数据后更新数据
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    //保留一个subject对象，用户解除注册
    private Subject subject;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println(this.toString()+":temp" + temp + ",humidity" + humidity + ",pressure" + pressure);
    }

    public void removeSelf() {
        subject.unregisterObserver(this);
    }
}
