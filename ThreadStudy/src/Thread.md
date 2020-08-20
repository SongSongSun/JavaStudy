# 线程

#### 1.什么情况下线程会停止
+ run()方法执行完毕
+ 线程中出现异常，并未捕获，线程会停止，并且线程占用的资源会被jvm回收


#### 2.循环中包含try/catch，try/catch中包含Thread.sleep会出现无法停止线程的情况
+ 传递中断——在方法签名中声明InterruptException
+ 恢复中断——捕获的时候重新设置中断  Thread.currentThread().interrupt()
+ 不应屏蔽中断
