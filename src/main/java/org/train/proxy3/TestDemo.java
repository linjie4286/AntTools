package org.train.proxy3;

/**
 * description
 *
 * @author zhaolinjie 2020/12/23 10:17
 */
public class TestDemo {

    public static void main(String[] args) {

        People people = new Proxy(new Student());
        people.eat();
        System.out.println("======================");

        Student student = new Student();
        student.eat();

    }

}
