package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author hugh
 * @create 2022-05-21 18:56
 */
public interface AccountService {
    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
