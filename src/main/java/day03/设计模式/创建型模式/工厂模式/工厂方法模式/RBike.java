package day03.设计模式.创建型模式.工厂模式.工厂方法模式;

public class RBike implements Bike {

    public RBike(){
        System.out.println("调用RBike");
    }
    @Override
    public void ride() {
        System.out.println("开RBike");
    }
}
