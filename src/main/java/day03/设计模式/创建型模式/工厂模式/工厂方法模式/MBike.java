package day03.设计模式.创建型模式.工厂模式.工厂方法模式;

public class MBike implements Bike {

    public MBike(){
        System.out.println("调用MBike");
    }

    @Override
    public void ride() {
        System.out.println("骑MBike");
    }
}
