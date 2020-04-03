package day01.泛型;

/**
 * 泛型接口未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中：
 * 泛型是Java SE 1.5的新特性，泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。
 * 这种参数类型可以用在类、接口和方法的创建中，分别称为泛型类、泛型接口、泛型方法。
 */

/**
*泛型的好处是在编译的时候检查类型安全，并且所有的强制转换都是自动和隐式的，以提高代码的重用率。
* */
public class Fstyle<T> implements style<T> {
    private T style;

    public T getStyle() {
        return style;
    }

    public void setStyle(T style) {
        this.style = style;
    }

    @Override
    public void run() {


    }


}

/**
 * 如果泛型接口传入类型参数时，实现该泛型接口的实现类，则所有使用泛型的地方都要替换成传入的实参类型
 */
class Cstyle implements c<String> {

    @Override
    public void sun() {

    }
}
/*? extends E:接收E类型或者E的子类型。
  ? super E:接收E类型或者E的父类型*/
/*
Class<T>和Class<?>区别
Class<T>在实例化的时候，T要替换成具体类
Class<?>它是个通配泛型，?可以代表任何类型，主要用于声明时的限制情况
* */
