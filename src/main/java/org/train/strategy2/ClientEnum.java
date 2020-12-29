package org.train.strategy2;

/**
 * 策略模式
 *
 * @author zhaolinjie 2020/12/29 9:29
 */
public class ClientEnum {

    public static void main(String[] args) {


        PriceStrategyContext priceStrategyContext = new PriceStrategyContext();
        MemberStrategy distributeStrategy = priceStrategyContext.getStrategy("INTERMEDIATE");

        distributeStrategy.calcPrice(100);

    }

}
