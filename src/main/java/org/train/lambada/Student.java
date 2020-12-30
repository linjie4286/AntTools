package org.train.lambada;

import java.math.BigDecimal;

/**
 * description
 *
 * @author zhaolinjie 2020/12/30 9:54
 */
public class Student {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 学费
     */
    private BigDecimal studyFee;

    public Student(String name, int age, BigDecimal studyFee) {
        this.name = name;
        this.age = age;
        this.studyFee = studyFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getStudyFee() {
        return studyFee;
    }

    public void setStudyFee(BigDecimal studyFee) {
        this.studyFee = studyFee;
    }
}
