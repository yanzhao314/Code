package day03.设计模式.创建型模式.工厂模式.工厂方法模式;

/**
 * 生产对象的类称为工厂!!!!!!!!
 * 工厂方法模式和简单工厂模式最大的不同在于,
 * 简单工厂模式只有一个工厂类,而工厂方法模式有一组实现了相同接口的工厂类.
 * 是简单工厂的进一步加深
 * */
/**
* 创建抽象产品类 & 定义具体产品的公共接口；
 * 创建具体产品类（继承抽象产品类） & 定义生产的具体产品；
 * 创建工厂类，通过创建静态方法根据传入不同参数从而创建不同具体产品类的实例；
 * 外界通过调用工厂类的静态方法，传入不同参数从而创建不同具体产品类的实例
 * 一般用于封装固定的类的对象
* */


public interface Bike {

    void ride();
}
