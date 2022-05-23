package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.AccountDao;
import com.atguigu.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author hugh
 * @create 2022-05-21 18:58
 */
@Service
public class AccountServiceImpl implements AccountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("--------------->account-service中扣减账户余额开始 userId: " + userId + ", money: " + money);
        // 模拟超时异常
        // 暂停几秒钟线程
        // try {
        //     Thread.sleep(20000);    // 暂停20s
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        accountDao.decrease(userId, money);
        LOGGER.info("--------------->acount-service中扣减账户余额结束");
    }
}
