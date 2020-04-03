package day03.设计模式.结构型模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
* 底层是实现反射实现的,是在程序运行期间动态创建接口实现
 * dk的动态代理由Proxy这个类来生成，它有三个参数：
 * 1:   ClassLoader loader,:指定当前目标对象使用类加载器,获取加载器的方法是固定的
 * 2:   Class<?>[] interfaces,:目标对象实现的接口的类型,使用泛型方式确认类型
 * 3:   InvocationHandler h:事件处理,执行目标对象的方法时,
 * 会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
 * 不足:它只能为接口创建代理实例
* */

public class  DynamicProxy {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object newInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("start writing");
                    Object object = method.invoke(target, args);
                    System.out.println("end writing");
                    return object;
                });
    }
}



