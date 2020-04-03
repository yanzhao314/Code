package day03.设计模式.创建型模式.单例模式.懒汉式;


/**
 * 优点:
 * 几个好处：
 * <p>
 * 1、某些类创建比较频繁，或一个对象需要消耗的资源过多，如要访问IO和数据库等资源，这时就要考虑使用单例模式。
 * <p>
 * 2、不能通过new的形式构造对象，只能通过getInstance()函数来获取，而这个对象是静态函数，
 * 并且在声明的时候已经初始化了，这就保证了对象的唯一性降低了系统内存的使用频率，减轻GC压力。
 * 默认不实例化,需要时载实例化
 */

/**
 * 方法一:满足基本要求
 * 缺点:线程不安全,不适合多线程
 * */


/**
 * 懒汉式:单例实例在第一次被使用时构建，延迟初始化
 * 执行getInstance()才会被实例化
 * 时间换空间
 * */
public class Singleton {

    /**声明初始化 保证了对象的唯一性*/
    private static Singleton instance = null;

    /**私有构造方法，防止被实例化*/
    private Singleton() {

    }

    /** 公有的静态函数:对外暴露获取单例对象的接口  获取实例 */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 方法二:改进
     *只有在创建对象时加锁,缺点:耗性能
     * */
    public static synchronized Singleton getInstance1() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    /**方法三:改进
    * 只有在第一次创建对象时需要加锁 之后不需要
    * */
    public static Singleton getInstance2(){
        if (instance == null){
            synchronized (instance){
                /**双重锁定,保证不会new两次*/
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    /**方法四:反射攻击 上面都没有实现真正的单例 反射可以调用私有构造器
     * 改造:在私有构造器进行判断
     */



}
