package org.train.strategy;

/**
 * description
 *
 * @author zhaolinjie 2020/12/28 16:52
 */
public class StrategyMain {

    public static void main(String[] args) {
        String msg = ":open";
        // 未测试通过
        StrategyServiceContext strategyServiceContext = new StrategyServiceContext();
        IStrategyService instance = strategyServiceContext.getInstance(msg);
        instance.process(msg) ;
    }

}
