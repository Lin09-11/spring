package com.itheima.service.impl;

import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
//全局的事务控制
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    @Autowired//注入
    private AccountMapper accountMapper;

    //代替了配置文件Spring的Advise的配置
    //@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        //开启事务
        accountMapper.decrMoney(outAccount, money);
        int i = 1 / 0;//错误代码
        accountMapper.incrMoney(inAccount, money);
    }

    public void registAccount(){

    }
}
