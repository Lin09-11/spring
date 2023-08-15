package com.itheima.service;

public interface AccountService {

    //转钱
    void transferMoney(String outAccount,String inAccount,Integer money);

}
