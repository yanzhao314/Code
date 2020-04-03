package day03.设计模式.结构型模式.代理模式.动态代理;

import day03.设计模式.结构型模式.代理模式.静态代理.ProxyObject;
import day03.设计模式.结构型模式.代理模式.静态代理.TargetObject;

public class TestProxy {
    public static void main(String[] args) {
        TargetObject targetObject = new TargetObject();
        System.out.println(targetObject.getClass());

        //给目标对象,创建代理对象
        ProxyObject proxyObject = (ProxyObject) new DynamicProxy(targetObject).newInstance();
        System.out.println(proxyObject.getClass());

        //代理对象执行方法
        proxyObject.writeBlog();
    }


}
