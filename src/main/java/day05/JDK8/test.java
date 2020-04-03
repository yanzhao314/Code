package day05.JDK8;

public class test {
    public static void main(String[] args) {
        new Thread(
                () -> System.out.println("Thread run()")// 省略接口名和方法名
        ).start();
    }
}

