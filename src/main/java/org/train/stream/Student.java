package org.train.stream;

/**
 * description
 *
 * @author zhaolinjie 2020/12/29 17:07
 */
public class Student {

    private int Age;

    private String Name;

    public Student(String name, int age) {
        this.Age = age;
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
