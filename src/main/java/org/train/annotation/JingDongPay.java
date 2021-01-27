package org.train.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author zhaolinjie 2021/01/15 14:16
 */

@PayCode(value = "jingdong", name = "京东支付")
@Service
@Component
public class JingDongPay implements IPay {

    @Override
    public void pay() {
        System.out.println("京东支付成功");
    }
}
