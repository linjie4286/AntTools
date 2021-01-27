package org.train.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * description
 *
 * @author zhaolinjie 2021/01/05 9:59
 */
public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }
}
