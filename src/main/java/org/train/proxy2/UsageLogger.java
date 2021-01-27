package org.train.proxy2;

/**
 * description
 *
 * @author zhaolinjie 2020/12/23 11:26
 */
public class UsageLogger {
    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    //记录日志
    public void save() {
        //...
    }

    public void save(String userId) {
        this.userId = userId;
        save();
    }
}
