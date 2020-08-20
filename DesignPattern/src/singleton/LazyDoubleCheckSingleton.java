package singleton;

import java.lang.reflect.InvocationTargetException;

/**
 * 双重检查锁机制的线程安全的懒汉单例模式
 */
public class LazyDoubleCheckSingleton {
    /**
     * volatile 关键字确保了对象在创建时严格按照 分配对象内存空间，初始化对象，将初始化对象的地址指向刚刚申请的内存空间
     */
    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {

        //第一次检测
        if (instance == null) {
            //同步
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    //memory = allocate(); //1.分配对象内存空间
                    //instance(memory);    //2.初始化对象
                    //instance = memory;   //3.设置instance指向刚分配的内存地址，此时instance！=null
                    instance = new LazyDoubleCheckSingleton();
                }

            }
        }
        return instance;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println(LazyDoubleCheckSingleton.getInstance());
        System.out.println(LazyDoubleCheckSingleton.getInstance());
    }
}

