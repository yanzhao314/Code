package day02.多线程.实现.守护线程;

public class ThreadDemoTest {
    /**
     关羽线程和张飞线程均设置为守护线程，刘备线程为用户进程。这三个线程均随机抢占CPU的使用权，
     当刘备抢占并且运行完毕之后，关羽和张飞这两个线程将在某一时间死亡，切记并不是立刻死亡，而是刘备线程执行完毕的一段时间后。
     */
        public static void main(String[] args) {
            ThreadDaemon td1 = new ThreadDaemon ();
            ThreadDaemon td2 = new ThreadDaemon ();
            td1.setName("关羽");
            td2.setName("张飞");

            //添加守护线程
            td1.setDaemon(true);
            td2.setDaemon(true);

            td1.start();
            td2.start();

            Thread.currentThread().setName("刘备");
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }

