package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hugh
 * @create 2022-05-21 16:30
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    /**
     * 创建订单
     * 注意: 这里为什么用GetMapping注解？
     * 因为这是面向消费侧的接口，即面向用户的接口，浏览器地址栏中只能使用get方式请求, 方便在地址栏访问
     * 实际在底层用的还是PostMapping
     * @param order
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
