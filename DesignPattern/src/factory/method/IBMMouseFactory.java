package factory.method;

import factory.entity.IBMMouse;
import factory.entity.Mouse;

/**
 * @Author Song
 * @Date 2020/7/8 16:44
 * @Version 1.0
 * @Description
 */
public class IBMMouseFactory extends HpMouseFactory {
    @Override
    public Mouse createMouse() {
        return new IBMMouse();
    }
}
