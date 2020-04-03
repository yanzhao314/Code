package day02.多线程.实现;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/*实现Callable接口，重写call()方法
       Callable接口实际是属于Executor框架中的功能类，Callable结构与Runnable接口的功能类似，但提供了比Runnable更强大的功能，主要体现在如下三点：
        1）Callable在任务结束后可以提供一个返回值，Runnable无法提供该功能。
        2）Callable中的call()方法可以跑出异常，而Runnable中的run()不能跑出异常。
        3）运行Callable可以拿到一个Future对象，Future对象表示异步计算的结果，它提供能了检查计算是否完成的方法。
            由于线程输入异步计算模型，因此无法从别的线程中得到函数的返回值，在这种情况下，
        使用Future来监控目标线程来调用call()方法的情况，当调用Future的get()方法以获取结果时，当前线程会阻塞，直到目标线程的call()方法结束返回结果*/
public class CallableAndFuture {

    //创建线程类
    public static class CallableTest implements Callable {
        @Override
        public String call() throws Exception {
            return "Hello World!";
        }
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<String> future = threadPool.submit(new CallableTest());
        try {
            System.out.println("waiting thread to finish");
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

