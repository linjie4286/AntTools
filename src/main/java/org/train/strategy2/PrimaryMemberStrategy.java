package org.train.strategy2;

/**
 * description
 *
 * @author zhaolinjie 2020/12/28 17:46
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}