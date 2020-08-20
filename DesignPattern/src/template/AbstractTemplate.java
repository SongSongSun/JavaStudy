package template;

/**
 * @Author Song
 * @Date 2020/7/20 10:40
 * @Version 1.0
 * @Description
 */
public abstract class AbstractTemplate {
    public void templateMethod() {
        concreteMethod();
        hookMethod();
        abstractMethod();
    }

    /**
     * 具体方法
     */
    public void concreteMethod() {
        System.out.println("模板里自带的实现方法，永恒不变");
    }

    /**
     * 钩子方法，子类可以依据实际情况进行选择
     */
    protected void hookMethod() {

    }

    /**
     * 抽象方法，必须让子类实现的方法
     */
    public abstract void abstractMethod();
}
