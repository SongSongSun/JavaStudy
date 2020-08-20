package test;

/**
 * @Author Song
 * @Date 2020/7/23 12:25
 * @Version 1.0
 * @Description
 */
public class Test {


    public static void main(String[] args) {
        Test W = new Test();
        //wait
        new Thread(W.new B()).start();
        //notify
        new Thread(W.new A()).start();
    }

    private class A implements Runnable {

        @Override
        public void run() {
            synchronized (Test.class) {

                try {
                    System.out.println("nofity运行开始");
                    Test.class.notifyAll();
                    Thread.sleep(10*1000);
                    System.out.println("nofity运行10秒，结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private class B implements Runnable {

        @Override
        public void run() {
            synchronized (Test.class){
                System.out.println("wait运行3秒");
                try {
                    Test.class.wait(3*1000);
                    System.out.println("wait后面能打印吗？");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
