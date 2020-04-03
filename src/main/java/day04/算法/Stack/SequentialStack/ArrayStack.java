package day04.算法.Stack.SequentialStack;

import java.util.Arrays;
//顺序栈
public class ArrayStack {
    private String [] items;
    private int count;
    private  int n;

    //初始化数组,申请一个大小为n的空间
    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    /**
     * 入栈
     * 数组入栈入口为数组尾部
     */
    public boolean push(String item) {
        if (count == n) {
            return false;
        }else {
            items[count]=item;
            ++count;
            return true;
        }
    }
    //出栈
    public String pop(){
        if (count == 0) {
            return null;
        }else {
            String tmp = items[count - 1];
            --count;
            return tmp;
        }
    }
}
