package day03.设计模式.创建型模式.单例模式.懒汉式;

import sun.security.jca.GetInstance;

/**
* 枚举实现单例既可以防止反射 又可以阻止序列化破环单例
* */

public enum  EnumSingle {
    INSTANCE;

    public static EnumSingle getInstance(){
        return INSTANCE;
    }

    public void func(){
        System.out.println("func....");
    }


}
