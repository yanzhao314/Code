package day02.多线程.实现.守护线程;

public class ThreadDaemon extends Thread {
    @Override
    public void run() {
        for(int i = 0 ; i<100;i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
