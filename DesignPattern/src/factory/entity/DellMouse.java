package factory.entity;

/**
 * @Author Song
 * @Date 2020/7/8 16:12
 * @Version 1.0
 * @Description
 */
public class DellMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("我是戴尔鼠标");
    }
}
