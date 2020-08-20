package com.song.stopthread;

/**
 * @Author Song
 * @Date 2020/7/24 15:31
 * @Version 1.0
 * @Description  在while内有try/catch时，无法正确中断，为满足循环跳出的条件
 */
public class CantInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            int num = 0;

            while (num <= 10000) {
                if (num % 100 == 0) {
                    System.out.println(num + "是100的倍数");
                }
                num++;
                throwException();
            }

        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
    }

    private static void throwException() {
        try {
            //会清楚中断标记位
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
