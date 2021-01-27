package org.train.proxy3;

/**
 * description
 *
 * @author zhaolinjie 2020/12/23 10:14
 */
public class Proxy implements People {

    private People people;

    //接收一个完成核心操作的对象
    public Proxy(People people) {
        this.people = people;
    }

    @Override
    public void eat() {
         this.pre();
         this.people.eat();
         this.post();
    }

    public void pre() {
        System.out.println("农民伯伯种粮食，餐厅做饭等吃饭前的准备工作。");
    }
    public void post() {
        System.out.println("餐厅工作人员打扫卫生等收尾工作。");
    }

}
