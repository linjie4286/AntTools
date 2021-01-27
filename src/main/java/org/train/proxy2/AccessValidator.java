package org.train.proxy2;

/**
 * description
 *
 * @author zhaolinjie 2020/12/23 11:27
 */
public class AccessValidator {

    //用户的权限查询发生在这里
    public boolean validateUser(String userId) {
        if (userId.equals("Admin")) {
            return true;
        } else {
            return false;
        }
    }
}
