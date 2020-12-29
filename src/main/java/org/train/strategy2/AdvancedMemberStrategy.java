package org.train.strategy2;

/**
 * description
 *
 * @author zhaolinjie 2020/12/28 17:52
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
