package factory.simple;

import factory.entity.DellMouse;
import factory.entity.HpMouse;
import factory.entity.Mouse;

/**
 * @Author Song
 * @Date 2020/7/8 16:14
 * @Version 1.0
 * @Description
 */
public class MouseFactory {
    public static Mouse createMouse(int type) {
        switch (type) {
            case 0:
                return new DellMouse();
            case 1:
                return new HpMouse();
            default:
                return new DellMouse();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(1);
        mouse.sayHi();
    }
}
