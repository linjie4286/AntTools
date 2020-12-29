package org.train.strategy;

import java.util.Map;

/**
 * description
 *
 * @author zhaolinjie 2020/12/28 16:35
 */
public class StrategyServiceContext {

    /**
     * 获取执行器实例
     * @param command 执行器实例
     * @return
     */
    public IStrategyService getInstance(String command) {

        Map<String, String> allClazz = StrategyEnum.getAllClazz();

        //兼容需要命令后接参数的数据 :q cross
        String[] trim = command.trim().split(" ");
        String clazz = allClazz.get(trim[0]);
        IStrategyService innerCommand = null;
        try {
            innerCommand = (IStrategyService) SpringBeanFactory.getBean(Class.forName(clazz));
        } catch (Exception e) {
            System.out.println(e);
        }

        return innerCommand;
    }

}
