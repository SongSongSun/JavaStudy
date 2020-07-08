package factory.abstractf;

import factory.entity.HpKeyBoard;
import factory.entity.HpMouse;
import factory.entity.KeyBoard;
import factory.entity.Mouse;

/**
 * @Author Song
 * @Date 2020/7/8 17:02
 * @Version 1.0
 * @Description
 */
public class HpComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HpKeyBoard();
    }
}
