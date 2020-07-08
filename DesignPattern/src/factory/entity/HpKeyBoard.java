package factory.entity;

/**
 * @Author Song
 * @Date 2020/7/8 17:01
 * @Version 1.0
 * @Description
 */
public class HpKeyBoard implements KeyBoard {
    @Override
    public void sayHello() {
        System.out.println("我是惠普键盘");
    }
}
