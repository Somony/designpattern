package chapter2.com.observerpattern.pull.impl;


import chapter2.com.observerpattern.pull.base.DisplayElement2;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: somon
 * @Date: 2018/2/2 16:16
 * @Desciption: 系统Observer的具体子类，收到Subject中更新的数据后主动pull需要的数据
 */
public class PullConditionDisplay implements Observer, DisplayElement2 {

    private float temp;
    private float humidity;
    private float pressure;
    private Observable o;

    public PullConditionDisplay(Observable o) {
        this.o = o;
        o.addObserver(this);
    }

    /**
     * 获取Observable中的数据
     * @param o  Observer对应的Observable对象
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 w = (WeatherData2) o;
            temp = w.getTemp();
            humidity = w.getHumidity();
            pressure = w.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(this.toString()+":temp" + temp + ",humidity" + humidity + ",pressure" + pressure);
    }

    public void removeSelf() {
        o.deleteObserver(this);
    }
}
