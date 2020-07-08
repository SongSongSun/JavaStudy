package factory.abstractf;

import factory.entity.DellKeyBoard;
import factory.entity.DellMouse;
import factory.entity.KeyBoard;
import factory.entity.Mouse;

/**
 * @Author Song
 * @Date 2020/7/8 17:00
 * @Version 1.0
 * @Description
 */
public class DellComputerFactory implements ComputerFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
