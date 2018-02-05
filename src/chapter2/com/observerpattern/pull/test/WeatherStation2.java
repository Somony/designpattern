package chapter2.com.observerpattern.pull.test;

import chapter2.com.observerpattern.pull.impl.PullConditionDisplay;
import chapter2.com.observerpattern.pull.impl.WeatherData2;

/**
 * @Author: somon
 * @Date: 2018/2/2 16:22
 * @Desciption:
 */
public class WeatherStation2 {
    public static void main(String[] args) {
        WeatherData2 weatherData2 = new WeatherData2();

        PullConditionDisplay pullConditionDisplay1 = new PullConditionDisplay(weatherData2);
        PullConditionDisplay pullConditionDisplay2 = new PullConditionDisplay(weatherData2);
        PullConditionDisplay pullConditionDisplay3 = new PullConditionDisplay(weatherData2);

        System.out.println(pullConditionDisplay1.toString());
        System.out.println(pullConditionDisplay2.toString());
        System.out.println(pullConditionDisplay3.toString());

        weatherData2.setData(50, 60, 70);

        /**
         * 顺序是倒序，java内部在通知的时候是倒序通知的
         * 程序不应该依赖Observer被通知的顺序，这样不是所认为的解耦合
         PullConditionDisplay@1540e19d
         PullConditionDisplay@677327b6
         PullConditionDisplay@14ae5a5

         PullConditionDisplay@14ae5a5:temp50.0,humidity60.0,pressure70.0
         PullConditionDisplay@677327b6:temp50.0,humidity60.0,pressure70.0
         PullConditionDisplay@1540e19d:temp50.0,humidity60.0,pressure70.0
         */

        pullConditionDisplay1.removeSelf();

        weatherData2.setData(51, 61, 71);

    }
}
