package org.train.proxy;

/**
 * 代理实例
 *
 * @author zhaolinjie 2020/12/29 11:27
 */
public class Client {

    public static void main(String[] args) {
        ProxyInterface proxyInterface = new WeddingCompany(new NormalHome());
        proxyInterface.marry();
    }
}
