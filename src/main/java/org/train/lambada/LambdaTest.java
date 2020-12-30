package org.train.lambada;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * description
 *
 * @author zhaolinjie 2020/12/30 9:56
 */
public class LambdaTest {

    private static final int ageLit = 30;

    private static final BigDecimal feeLit = new BigDecimal("18000.99");

    public static void main(String[] args) {


        List<Student> list = Arrays.asList(
                new Student("赵敏", 18, new BigDecimal("15000.11"))
                , new Student("张无忌", 20, new BigDecimal("16000.99"))
                , new Student("周芷若", 25, new BigDecimal("18000.99"))
                , new Student("小昭", 40, new BigDecimal("21000.99"))
                , new Student("宋青书", 50, new BigDecimal("31000.99")));

        List<Student> list1 = list.stream().filter(student -> student.getStudyFee().compareTo(feeLit)>0).collect(Collectors.toList());

        List<BigDecimal> list2 = list.stream().filter(e->e.getAge()<30).map(e->e.getStudyFee()).collect(Collectors.toList());

        List<Student> list3 = list.stream().filter(student -> student.getStudyFee().compareTo(feeLit)>0).collect(Collectors.toList());

        list3.forEach(a -> System.out.println(a.getStudyFee()));

        System.out.println("End");
    }
}
