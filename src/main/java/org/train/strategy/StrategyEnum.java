package org.train.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author zhaolinjie 2020/12/28 16:26
 */
public enum StrategyEnum {

    OPEN(":open       ","策略模式1 Open","OpenStrategyService"),
    CLOSE(":close       ","策略模式2 Close","CloseStrategyService");

    /** 枚举值码 */
    private final String commandType;

    /** 枚举描述 */
    private final String desc;

    /**
     * 实现类
     */
    private final String clazz ;

    StrategyEnum(String commandType, String desc, String clazz) {
        this.commandType = commandType;
        this.desc = desc;
        this.clazz = clazz;
    }

    /**
     * 得到枚举值码。
     * @return 枚举值码。
     */
    public String getCommandType() {
        return commandType;
    }
    /**
     * 获取 class。
     * @return class。
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * 得到枚举描述。
     * @return 枚举描述。
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 得到枚举值码。
     * @return 枚举值码。
     */
    public String code() {
        return commandType;
    }

    /**
     * 得到枚举描述。
     * @return 枚举描述。
     */
    public String message() {
        return desc;
    }

    /**
     * 获取全部枚举值码。
     *
     * @return 全部枚举值码。
     */
    public static Map<String,String> getAllStatusCode() {
        Map<String,String> map = new HashMap<String, String>(16) ;
        for (StrategyEnum status : values()) {
            map.put(status.getCommandType(),status.getDesc()) ;
        }
        return map;
    }

    public static Map<String,String> getAllClazz() {
        Map<String,String> map = new HashMap<String, String>(16) ;
        for (StrategyEnum status : values()) {
            map.put(status.getCommandType().trim(),"org.train.strategy.impl." + status.getClazz()) ;
        }
        return map;
    }

}
