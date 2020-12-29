package org.train.stack;

/**
 * description
 *
 * @author zhaolinjie 2020/12/29 13:42
 */
public class Client {

    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        SyncStack stack = new SyncStack();
        Consumer p = new Consumer(stack);
        Producter c = new Producter(stack);

        new Thread(p).start();
        new Thread(c).start();

    }

}
