package org.train.compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * description
 *
 * @author zhaolinjie 2020/12/30 14:30
 */
public class Test1 {

    public static void main(String[] args) {

        String[] str = {"1","6","2","3","4","4"};
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2) ;
            }
        });

        System.out.println("End");

    }
}
