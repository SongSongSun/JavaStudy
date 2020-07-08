package factory.method;

import factory.entity.DellMouse;
import factory.entity.Mouse;

/**
 * @Author Song
 * @Date 2020/7/8 16:35
 * @Version 1.0
 * @Description
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
