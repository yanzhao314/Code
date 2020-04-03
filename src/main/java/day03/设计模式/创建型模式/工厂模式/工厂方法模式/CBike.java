package day03.设计模式.创建型模式.工厂模式.工厂方法模式;

public class CBike implements Bike {

    public CBike(){
        System.out.println("调用CBike");
    }
    @Override
    public void ride() {
        System.out.println("买CBike");
    }
}
