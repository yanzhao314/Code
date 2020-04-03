package day03.设计模式.创建型模式.单例模式.饿汉式;

/**
 *  饿汉式单例模式在类加载时完成了初始化，线程安全用于多线程
 *  所以类加载较慢，如果不使用的浪费内存空间，但获取对象的速度快。
 *  空间换时间
 *
 * */
public class EagerSinleton {
    private static final EagerSinleton instance = new EagerSinleton();

    private EagerSinleton(){};

    public static EagerSinleton getInstance(){

        return instance;
    }

}
