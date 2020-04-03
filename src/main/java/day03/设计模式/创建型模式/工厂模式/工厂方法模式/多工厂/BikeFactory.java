package day03.设计模式.创建型模式.工厂模式.工厂方法模式.多工厂;

import day03.设计模式.创建型模式.工厂模式.工厂方法模式.Bike;
import day03.设计模式.创建型模式.工厂模式.工厂方法模式.CBike;
import day03.设计模式.创建型模式.工厂模式.工厂方法模式.MBike;
import day03.设计模式.创建型模式.工厂模式.工厂方法模式.RBike;

/**
* 多工厂常用
* */

public class BikeFactory {
    public static Bike ceateMBike(){
        return new MBike();
    }
    public static Bike ceateRBike(){
     return new RBike();
    }
    public static Bike ceateCBike(){
        return new CBike();
    }
}
