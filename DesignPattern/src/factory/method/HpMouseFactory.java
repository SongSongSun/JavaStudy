package factory.method;

import factory.entity.HpMouse;
import factory.entity.Mouse;

/**
 * @Author Song
 * @Date 2020/7/8 16:33
 * @Version 1.0
 * @Description
 */
public class HpMouseFactory implements MouseFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
