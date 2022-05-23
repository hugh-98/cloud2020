package com.atguigu.springcloud.alibaba.service;

/**
 * @author hugh
 * @create 2022-05-21 18:21
 */
public interface StorageService {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
