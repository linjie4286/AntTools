package org.train.strategy.impl;

import org.train.strategy.IStrategyService;

/**
 * 策略模式2
 *
 * @author zhaolinjie 2020/12/28 16:21
 */
public class CloseStrategyService implements IStrategyService {

    public void process(String msg) {
        System.out.println("策略模式2 Close");
    }

}
