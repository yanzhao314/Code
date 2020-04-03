package day02.多线程.生产消费者模型.使用;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁ReentrantLock的实现
 *对lock的lock()方法和unlock()方法实现了对锁的显示控制，
 * 而synchronize()则是对锁的隐性控制。
 * 可重入锁，指的是同一线程 外层函数获得锁之后 ，
 * 内层递归函数仍然有获取该锁的代码，但不受影响
 *
 * 锁需要被释放两次才能获得真正释放。
 * 已经获取锁的线程进入其他需要相同锁的同步代码块不会被阻塞
 * */

public class Test2 {
    private static Integer count = 0;
    private static  final Integer FULL = 10;
    private Lock lock = new ReentrantLock();

    //创建两个条件变量，一个为缓冲区非满，一个为缓冲区非空

    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        new Thread(test2.new Producer()).start();
        new Thread(test2.new Consumer()).start();
        new Thread(test2.new Producer()).start();
        new Thread(test2.new Consumer()).start();
    }
    class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //获取锁
                lock.lock();
                try {
                    while (count.equals(FULL)) {
                        try {
                            notFull.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName()
                            + "生产者生产，目前总共有" + count);
                    //唤醒消费者
                    notEmpty.signal();
                } finally {
                    //释放锁
                    lock.unlock();
                }
            }
        }
    }
    class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                lock.lock();
                try {
                    while (count == 0) {
                        try {
                            notEmpty.await();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName()
                            + "消费者消费，目前总共有" + count);
                    notFull.signal();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

}
