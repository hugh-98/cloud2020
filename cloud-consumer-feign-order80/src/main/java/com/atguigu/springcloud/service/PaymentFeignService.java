package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hugh
 * @create 2022-04-25 18:35
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")   // 指定要调用的服务名
public interface PaymentFeignService {
    // 这里定义的方法 是 服务提供者中 controller 中的！
    // 相当于把服务提供者中 controller 层的方法直接复制过来用！
    @GetMapping("/payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeout();
}
