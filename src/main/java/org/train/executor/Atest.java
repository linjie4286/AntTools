package org.train.executor;

/**
 * description
 *
 * @author zhaolinjie 2021/01/08 11:34
 */
public class Atest {


    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getId() + " 2222222 enter time:" + System.currentTimeMillis());

        MyThreadPoolManager myThreadPoolManager = MyThreadPoolManager.getsInstance();
        for (int i = 0; i < 100000; i++) {
            MyThread myThread = new MyThread();
            myThreadPoolManager.execute(myThread);
        }

        System.out.println("3333leave time:" + System.currentTimeMillis());
        Thread.sleep(100000); // 因为junit结束会结束jvm，所以让它等会异步线程
    }

}
