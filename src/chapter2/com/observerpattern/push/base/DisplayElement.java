package chapter2.com.observerpattern.push.base;

/**
 * @Author: somon
 * @Date: 2018/2/1 18:54
 * @Desciption: 此demo所有的Observer收到更新后展示数据，故定义一个接口规范，这个接口试具体场景而定
 */
public interface DisplayElement {
    /**
     * 展示数据
     */
    void display();
}
