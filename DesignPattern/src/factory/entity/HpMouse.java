package factory.entity;

/**
 * @Author Song
 * @Date 2020/7/8 16:13
 * @Version 1.0
 * @Description
 */
public class HpMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("我是惠普鼠标");
    }
}
