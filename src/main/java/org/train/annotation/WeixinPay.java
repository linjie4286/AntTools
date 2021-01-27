package org.train.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author zhaolinjie 2021/01/15 14:08
 */
@PayCode(value = "weixin",name = "微信支付")
@Service
@Component
public class WeixinPay implements IPay {

    @Override
    public void pay() {
        System.out.println("微信支付成功");
    }
}
