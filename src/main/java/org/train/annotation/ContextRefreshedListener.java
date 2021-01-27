package org.train.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author zhaolinjie 2021/01/15 14:29
 */
@Component
public class ContextRefreshedListener  implements ApplicationListener<ContextRefreshedEvent> {

    private static Map<String, IPay> payMap = null;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        java.util.Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(PayCode.class);

        if (beansWithAnnotation != null) {
            payMap = new HashMap<>();
            beansWithAnnotation.forEach((key, value) -> {
                String bizType = value.getClass().getAnnotation(PayCode.class).value();
                payMap.put(bizType, (IPay) value);
            });
        }
    }

    public void pay(String code) {
        payMap.get(code).pay();
    }
}
