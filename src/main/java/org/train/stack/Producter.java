package org.train.stack;

/**
 * description
 *
 * @author zhaolinjie 2020/12/29 13:40
 */
public class Producter implements Runnable {

    private SyncStack stack;

    public Producter(SyncStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("生产者线程");
        for (int i = 0; i < stack.pro().length; i++) {
            String producter = "产品" + i;
            stack.push(producter);
            System.out.println("生产了：" + producter);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

}
