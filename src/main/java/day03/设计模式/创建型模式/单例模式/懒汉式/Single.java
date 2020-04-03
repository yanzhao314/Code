package day03.设计模式.创建型模式.单例模式.懒汉式;

/**
 * 前三种并没有实现真正的单例 通过反射仍可以获取私有构造 但通过序列化破环单例模式
* 第四种:反射攻击
* */
public class Single {

        private static Single single;
        private Single(){
            synchronized (Single.class){
                if (single != null) {
                    throw new RuntimeException("拒绝再次实例.");
                }
                single = this;
            }
        }

        public static Single getInstance(){
            if (single == null) {
                synchronized (Single.class) {
                    if (single == null) {
                        single = new Single();
                    }
                }
            }
            return single;
        }
    }


