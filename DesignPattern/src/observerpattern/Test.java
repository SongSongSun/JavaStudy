package observerpattern;

/**
 * @Author Song
 * @Date 2020/5/19 11:25
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        ObserverApp app = new ObserverApp(System.currentTimeMillis());

        app.addObserver(new ObserverA());
        app.addObserver(new ObserverB());

        Thread.sleep(1000);

        long curr = System.currentTimeMillis();
        app.change(curr);

        System.out.println(curr);
    }
}
