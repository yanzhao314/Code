package day03.设计模式.结构型模式.代理模式.静态代理;


/**
 * 代理对象
 * 通过构造方法获取目标对象并实现目标接口
 * 在目标接口方法调用目标对象的方法
 */


public class ProxyObject implements StaticProxy {
    private TargetObject targetObject;

    public ProxyObject(TargetObject targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public void writeBlog() {
        System.out.println("代理对象执行");
        targetObject.writeBlog();
        System.out.println("目标对象");
    }
}
