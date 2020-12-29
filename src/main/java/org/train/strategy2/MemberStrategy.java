package org.train.strategy2;

/**
 * description
 *
 * @author zhaolinjie 2020/12/28 17:46
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return    计算出打折后的价格
     */
    public double calcPrice(double booksPrice);
}
