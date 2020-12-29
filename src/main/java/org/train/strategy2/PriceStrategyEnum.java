package org.train.strategy2;

import org.springframework.util.StringUtils;

/**
 * description
 *
 * @author zhaolinjie 2020/12/29 9:11
 */
public enum PriceStrategyEnum {

    /**
     * 高级会员
     */
    ADVANCED("ADVANCED", "org.train.strategy2.AdvancedMemberStrategy"),
    /**
     * 中级会员
     */
    INTERMEDIATE("INTERMEDIATE", "org.train.strategy2.IntermediateMemberStrategy"),
    /**
     * 小米支付
     */
    PRIMARY("PRIMARY", "org.train.strategy2.PrimaryMemberStrategy");


    private String code;
    private String className;

    PriceStrategyEnum() {
    }

    PriceStrategyEnum(String code, String className) {
        this.code = code;
        this.className = className;
    }

    public static String getClassNameByCode(String code) {
        String className = "";
        if (StringUtils.isEmpty(code)) {
            return className;
        }

        for (PriceStrategyEnum e : PriceStrategyEnum.values()) {
            if (e.code.equalsIgnoreCase(code)) {
                className = e.className;
                break;
            }
        }
        return className;
    }

    public String getCode() {
        return code;
    }

    public String getClassName() {
        return className;
    }
}
