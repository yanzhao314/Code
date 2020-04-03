package day03.设计模式.创建型模式.工厂模式.工厂方法模式;

/**
 * 让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类。
 * 适用场景:
 *     (1)客户端不需要知道它所创建的对象的类。例子中我们不知道每个图片加载器具体叫什么名，只知道创建它的工厂名就完成了床架过程。
 * 　　（2）客户端可以通过子类来指定创建对应的对象。
 * @author zhao 测试
* */
public class FactoryPattern {
    public static void main(String[] args) {

      Bike MBike = BikeFactory.getBike("MBike");
        Bike rBike = BikeFactory.getBike("RBike");
        rBike.ride();
    }
}
