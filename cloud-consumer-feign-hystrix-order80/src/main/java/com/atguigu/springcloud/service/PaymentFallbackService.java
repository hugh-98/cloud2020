package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author hugh
 * @create 2022-04-29 10:04
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------PaymentFallbackService fall back--paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "--------PaymentFallbackService fall back--paymentInfo_TimeOut";
    }
}
