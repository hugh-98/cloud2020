package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author hugh
 * @create 2022-05-16 10:30
 */
public class CustomerBlockHandler {
    // 注意: 这里一定要用 static 修饰,
    // 同时返回值类型和RateLimitController中的customerBlockHandler方法的返回值类型相同
    public static CommonResult handlerException(BlockException e) {
        return new CommonResult(444, "按客户自定义, global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException e) {
        return new CommonResult(444, "按客户自定义, global handlerException---2");
    }
}
