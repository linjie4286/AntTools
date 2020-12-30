package org.train.stream;

import java.util.stream.Stream;

/**
 * description
 *
 * @author zhaolinjie 2020/12/29 16:35
 */
public class Client1 {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(6, 4, 6, 7, 3, 9, 8, 10, 12, 14, 14);

        /*filter：过滤流中的某些元素
        limit(n)：获取n个元素
        skip(n)：跳过n元素，配合limit(n)可实现分页
        distinct：通过流中元素的 hashCode() 和 equals() 去除重复元素*/
        Stream<Integer> newStream = stream.filter(s -> (s > 5)).distinct().skip(2).limit(2);

        newStream.forEach(System.out::println);


    }
}
