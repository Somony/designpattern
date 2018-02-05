package chapter2.com.observerpattern.push.test;


import chapter2.com.observerpattern.push.impl.CurrentConditionDisplay;
import chapter2.com.observerpattern.push.impl.WeatherData;

/**
 * @Author: lhc
 * @Date: 2018/2/2 16:22
 * @Desciption:
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay1 = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay2 = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay3 = new CurrentConditionDisplay(weatherData);

        System.out.println(currentConditionDisplay1.toString());
        System.out.println(currentConditionDisplay2.toString());
        System.out.println(currentConditionDisplay3.toString());

        //三个Observer都会收到更新消息
        weatherData.setData(50, 60, 75);

        /**
         * 加入顺序和更新顺序相同
         *
        CurrentConditionDisplay@1540e19d
        CurrentConditionDisplay@677327b6
        CurrentConditionDisplay@14ae5a5
        CurrentConditionDisplay@1540e19d:temp50.0,humidity60.0,pressure75.0
        CurrentConditionDisplay@677327b6:temp50.0,humidity60.0,pressure75.0
        CurrentConditionDisplay@14ae5a5:temp50.0,humidity60.0,pressure75.0
         */

        currentConditionDisplay1.removeSelf();

        weatherData.setData(51, 61, 76);

    }
}
