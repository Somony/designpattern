package chapter2.com.observerpattern.push.base;


/**
 * @Author: somon
 * @Date: 2018/2/1 18:45
 * @Desciption: 观察者接口，所有观察者实现此接口，提供自己的update实现
 */
public interface Observer {
    /**
     * 供Subject调用，当有更新时会通知Observer
     * 直接传入具体的参数和数量或许不明智，应该封装起来
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
