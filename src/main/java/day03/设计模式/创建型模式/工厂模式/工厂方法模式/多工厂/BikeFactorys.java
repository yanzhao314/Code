package day03.设计模式.创建型模式.工厂模式.工厂方法模式.多工厂;

import day03.设计模式.创建型模式.工厂模式.工厂方法模式.Bike;

import java.sql.SQLOutput;

public class BikeFactorys {
    public static void main(String[] args) {
        System.out.println("多工厂方法可扩展性高容错低");
        Bike bike = BikeFactory.ceateMBike();
        bike.ride();
        Bike rBike = BikeFactory.ceateRBike();
        rBike.ride();
    }
}
