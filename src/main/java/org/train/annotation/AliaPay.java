package org.train.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author zhaolinjie 2021/01/15 14:07
 */
@PayCode(value = "alia", name = "支付宝支付")
@Service
@Component
public class AliaPay implements IPay {

    @Override
    public void pay() {
        System.out.println("支付宝支付成功");
    }
}
