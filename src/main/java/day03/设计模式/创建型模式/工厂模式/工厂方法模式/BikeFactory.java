package day03.设计模式.创建型模式.工厂模式.工厂方法模式;

/**
 * 缺点:可扩展性差,
 */

public class BikeFactory {
    public static final String TAG = "BikeFactory";

    public static Bike getBike(String type) {
        Bike bike = null;
        if (type.equalsIgnoreCase("RBike")) {
            return new RBike();
        } else if (type.equalsIgnoreCase("MBike")) {
            return new MBike();
        } else if (type.equalsIgnoreCase("CBike")) {
            return new CBike();
        }
        return bike;
    }


}
