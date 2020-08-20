package com.song.stopthread;

/**
 * @Author Song
 * @Date 2020/7/24 14:58
 * @Version 1.0
 * @Description Run方法中没有sleep或者wait 方法停止线程
 * <p>
 * <p>
 * 打印出 最大整数的一半 中的10000的倍数
 */
public class RightWayStopThreadWithoutSleep implements Runnable {

    @Override
    public void run() {
        int num = 0;
        while (!Thread.currentThread().isInterrupted() && num <= Integer.MAX_VALUE / 2) {
            if (num % 10000 == 0) {
                System.out.println(num + "是10000的倍数");
            }
            num++;
        }
        System.out.println("任务结束");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadWithoutSleep());
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
