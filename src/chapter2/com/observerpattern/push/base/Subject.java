package chapter2.com.observerpattern.push.base;


/**
 * @Author: Somon
 * @Date: 2018/2/1 18:28
 * @Desciption: Subject对象的通用接口，提供注册为Observer，和解除成为Observer方法以及更新Observer的标准
 */
public interface Subject {
    /**
     * 注册为Observer
     */
    void registerObserver( Observer o);

    /**
     * 解除Observer
     */
    void unregisterObserver(Observer o);

    /**
     * Subject有改变时会调用这个方法提示Observer更新
     */
    void notifyObserver();
}
