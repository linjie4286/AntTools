package org.train.proxy;

/**
 * description
 *
 * @author zhaolinjie 2020/12/29 11:24
 */
public class NormalHome implements ProxyInterface {

    @Override
    public void marry() {
        System.out.println("我们结婚了");
    }

}
