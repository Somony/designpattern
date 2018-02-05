package chapter2.com.observerpattern.pull.impl;


import java.util.Observable;

/**
 * @Author: somon
 * @Date: 2018/2/2 16:10
 * @Desciption: 系统Observable的具体子类实现
 * Observable是类，具有addObserver和deleteObserver方法
 * <p>
 * Observable类的缺点：是一个类，必须自定义类继承Observable才能使用，若需要再继承别的类就做不到了
 * 关键的setChanged()是protected,无法使用组合的方式集成到类中
 * <p>
 * 如果只是为了使用和扩展Observable可以使用，否者推荐自定义Subject接口实现
 */
public class WeatherData2 extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

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

        notifyChange();
    }

    /**
     * 通知数据改变
     */
    private void notifyChange() {
        //报告有更新,改变状态，可以避免频繁更新
        setChanged();
        notifyObservers();
        clearChanged();
    }

    /**
     * 提供getter，供Observer主动pull数据
     *
     * @return
     */

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
