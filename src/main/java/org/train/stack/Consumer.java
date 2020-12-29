package org.train.stack;

/**
 * description
 *
 * @author zhaolinjie 2020/12/29 13:41
 */
public class Consumer implements Runnable {


    private SyncStack stack;

    public Consumer(SyncStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("消费者线程");
        for (int i = 0; i < stack.pro().length; i++) {
            String consumer = stack.pop();
            System.out.println("消费了：" + consumer);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
