package factory.method;

import factory.entity.Mouse;

/**
 * @Author Song
 * @Date 2020/7/8 16:36
 * @Version 1.0
 * @Description
 */
public class FactoryMethonDemo {
    public static void main(String[] args) {
        MouseFactory mouseFactory = new HpMouseFactory();
        Mouse mouse = mouseFactory.createMouse();
        mouse.sayHi();

        MouseFactory mouseFactory1 = new IBMMouseFactory();
        Mouse mouse1 = mouseFactory1.createMouse();
        mouse1.sayHi();
    }
}
