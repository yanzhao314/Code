package day03.设计模式.结构型模式.代理模式.静态代理;




/**
 * 目标对象
 * @author zhao
 * */

public class TargetObject implements StaticProxy {
    @Override
    public void writeBlog() {
        System.out.println("目标对象要实现的方法");
    }
}
