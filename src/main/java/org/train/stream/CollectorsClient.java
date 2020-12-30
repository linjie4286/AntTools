package org.train.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * description
 *
 * @author zhaolinjie 2020/12/30 9:27
 */
public class CollectorsClient {

    public static void main(String[] args) {
        Student s1 = new Student("aa", 10);
        Student s2 = new Student("bb", 20);
        Student s3 = new Student("cc", 10);
        List<Student> list = Arrays.asList(s1, s2, s3);

        // 封装List
        List<Integer> ageList = list.stream().map(Student::getAge).collect(Collectors.toList());

        // 封装Set
        Set<Integer> ageSet = list.stream().map(Student::getAge).collect(Collectors.toSet());

        System.out.println("End");

    }

}
