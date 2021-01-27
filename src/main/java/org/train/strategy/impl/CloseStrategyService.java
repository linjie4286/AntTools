package org.train.strategy.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.train.strategy.IStrategyService;

/**
 * 策略模式2
 *
 * @author zhaolinjie 2020/12/28 16:21
 */
@Service
@Component
public class CloseStrategyService implements IStrategyService {

    public void process(String msg) {
        System.out.println("策略模式2 Close");
    }

}
