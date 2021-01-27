package org.train.annotation1;

/**
 * description
 *
 * @author zhaolinjie 2021/01/26 15:30
 */
public class Calculator {

    @Check
    public void add() {
        System.out.println("加法执行");
    }

    @Check
    public void sub() {
        System.out.println("减法执行");
    }

    @Check
    public void div() {
        System.out.println("1/0 = " + (1 / 0));
    }

    //该方法没有加注解不会执行
    @Check
    public void method1() {
        System.out.println("你猜我会不会执行？");
    }
}
