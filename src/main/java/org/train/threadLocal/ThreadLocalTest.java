package org.train.threadLocal;

/**
 * description
 *
 * @author zhaolinjie 2021/01/27 17:47
 */
public class ThreadLocalTest {


    static ThreadLocal<String> localVar = new ThreadLocal<>();

    static String localVar1 = new String();

    static void print(String str) {
        //打印当前线程中本地内存中本地变量的值
        System.out.println(str + " :" + localVar.get());
        System.out.println(str + " :" + localVar1);
        //清除本地内存中的本地变量
        localVar.remove();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程1中本地变量的值
                localVar.set("localVar1");
                localVar1 = "localVar1.1";
                //调用打印方法
                print("thread1");
                //打印本地变量
                System.out.println("after remove : " + localVar.get());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程1中本地变量的值
                localVar.set("localVar2");
                localVar1 = "localVar3.1";
                //调用打印方法
                print("thread2");
                //打印本地变量
                System.out.println("after remove : " + localVar.get());
            }
        });

        t1.start();
        t2.start();
    }


}
