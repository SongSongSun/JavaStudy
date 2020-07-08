package factory.entity;

/**
 * @Author Song
 * @Date 2020/7/8 16:58
 * @Version 1.0
 * @Description
 */
public class DellKeyBoard implements KeyBoard {
    @Override
    public void sayHello() {
        System.out.println("我是戴尔键盘");
    }
}
