package org.train.strategy2;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * description
 *
 * @author zhaolinjie 2020/12/29 9:25
 */
public class PriceStrategyContext {

    @Autowired
    private Map<String, MemberStrategy>  memberStrategyMap;


    public MemberStrategy getStrategy(String code){


        try {
            return (MemberStrategy) Class.forName(PriceStrategyEnum.getClassNameByCode(code)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }

}
