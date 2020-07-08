package factory.abstractf;

import factory.entity.KeyBoard;
import factory.entity.Mouse;

/**
 * @Author Song
 * @Date 2020/7/8 16:59
 * @Version 1.0
 * @Description
 */
public interface ComputerFactory {
    Mouse createMouse();

    KeyBoard createKeyBoard();
}
