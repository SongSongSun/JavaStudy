package factory.entity;

import factory.simple.MouseFactory;

/**
 * @Author Song
 * @Date 2020/7/8 16:43
 * @Version 1.0
 * @Description
 */
public class IBMMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("我是惠普旗下的IBM鼠标");
    }
}
