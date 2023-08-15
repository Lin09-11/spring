package com.itheima.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {

    //使用注解方式写
    //+钱
    @Update("update tb_account set money=money+#{money} where account_name=#{accountName}")
    //Param：要进行映射
    public void incrMoney(@Param("accountName") String accountName,@Param("money") Integer money);
    //-钱
    @Update("update tb_account set money=money-#{money} where account_name=#{accountName}")
    public void decrMoney(@Param("accountName") String accountName,@Param("money") Integer money);

}
