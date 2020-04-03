package day02.多线程.实现;


/* 当使用synchronized来修饰某个共享资源时，如果线程A1在执行synchronized代码，线程A2也要执行同一对象的统同一synchronize的代码，
线程A2将要等到线程A1执行完后执行，这种情况可以使用wai()和notify()。必须是统一把锁，才生效。*/
class NumberPrint implements Runnable{
    private int number;
    public byte res[];
    public static int count = 5;
    public NumberPrint(int number, byte a[]){
        this.number = number;
        res = a;
    }
    @Override
    public void run(){
        synchronized (res){
            while(count-- > 0){
                try {
                    res.notify();//唤醒等待res资源的线程，把锁交给线程（该同步锁执行完毕自动释放锁）
                    System.out.println(" "+number);
                    res.wait();//释放CPU控制权，释放res的锁，本线程阻塞，等待被唤醒。
                    System.out.println("------线程"+Thread.currentThread().getName()+"获得锁，wait()后的代码继续运行："+number);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return;
        }

    }
}
class WaitNotify {
    public static void main(String args[]){
        final byte a[] = {0};//以该对象为共享资源
        new Thread(new NumberPrint((1),a),"1").start();
        new Thread(new NumberPrint((2),a),"2").start();
    }
}


