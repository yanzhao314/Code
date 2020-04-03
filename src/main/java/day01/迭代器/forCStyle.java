package day01.迭代器;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

public class forCStyle {

    @Test
    public void iterator() {
        List<String> strs = Arrays.asList("a", "b", "c");
        // Java 1.5之前的做法
        Iterator<String> iterator = strs.iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            out.println(str);
        }
    }


    @Test
    public void lanmba() {
        // 使用接收1.8lambda表达式的forEach方法进行快速遍历
        List<String> strs = Arrays.asList("a", "b", "c");
        strs.forEach(out::println);
    }

    @Test
    public void itator() {
        List<String> strs = Arrays.asList("a", "b", "c");
        for (String str : strs) {
            out.println(str);
        }
    }

}
/*迭代器的好处:
*                1迭代器可以提供统一的迭代方式。
                2、迭代器也可以在对客户端透明的情况下，提供各种不同的迭代方式。
                3、迭代器提供一种快速失败机制，防止多线程下迭代的不安全操作。
                * 迭代器是一个很典型的设计模式、详细可见其设计模式，可以使得序列类型的数据结构的遍历行为与被遍历的对象分离，
                * 无需关心该序列的底层结构是什么样子的。只要拿到这个对象,使用迭代器就可以遍历这个对象的内部。
                * 迭代出来的元素都是原来集合元素的拷贝*/


/*foreach循环:
           通过阅读源码我们还发现一个Iterable接口。它包含了一个产生Iterator对象的iterator()方法，
       而且将Iterator对象呗foreach用来在序列中移动。对于任何实现Iterable接口的对象都可以使用
       foreach循环。
           foreach语法的冒号后面可以有两种类型：一种是数组，另一种是是实现了Iterable接口的类
* */

/*foreach和Iterator的关系：
        for each以用来处理集合中的每个元素而不用考虑集合定下标。就是为了让用Iterator简单。但是删除的时候，区别就是在remove，
        循环中调用集合remove会导致原集合变化导致错误，而应该用迭代器的remove方法。
* */
/*for循环适合访问顺序结构,可以根据下标快速获取指定元素.
而Iterator 适合访问链式结构,因为迭代器是通过next()和Pre()来定位的.
可以访问没有顺序的集合.*/