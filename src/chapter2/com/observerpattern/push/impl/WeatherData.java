package chapter2.com.observerpattern.push.impl;


import chapter2.com.observerpattern.push.base.Observer;
import chapter2.com.observerpattern.push.base.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: somon
 * @Date: 2018/2/2 16:10
 * @Desciption: Subject的具体子类实现
 * 保存一个Observer列表，在数据更新的时候通知Observer
 */
public class WeatherData implements Subject {
    /**
     * 数据是否改变过的状态
     * 可以用于控制数据更新阈值，超过某一范围才通知Observer
     */
    private boolean changed;
    private List<Observer> observerList = new ArrayList<>();
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        if (!observerList.contains(o)) {
            observerList.add(o);
        }
    }

    @Override
    public void unregisterObserver(Observer o) {
        if (observerList.contains(o)) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        if (changed) {
            for (Observer o : observerList) {
                o.update(temp, humidity, pressure);
            }
        }
    }

    /**
     * 有数据更新就将数据传递过来
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        setChanged();
        notifyObserver();
        clearChanged();
    }

    public void setChanged() {
        changed = true;
    }

    public void clearChanged() {
        changed = false;
    }
}
