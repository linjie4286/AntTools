package org.train.strategy.impl;

import org.train.strategy.IStrategyService;

/**
 * 策略1
 *
 * @author zhaolinjie 2020/12/28 16:21
 */
public class OpenStrategyService implements IStrategyService {

    public void process(String msg) {
        System.out.println("策略模式1 Open");
    }
}
