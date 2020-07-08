package factory.abstractf;

import factory.entity.KeyBoard;
import factory.entity.Mouse;

/**
 * @Author Song
 * @Date 2020/7/8 17:04
 * @Version 1.0
 * @Description
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory cf = new HpComputerFactory();
        KeyBoard keyBoard = cf.createKeyBoard();
        Mouse mouse = cf.createMouse();
        keyBoard.sayHello();
        mouse.sayHi();
    }
}
