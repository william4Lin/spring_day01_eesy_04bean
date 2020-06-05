package com.william.service.impl;

import com.william.service.IAccountService;

/**
 * 模拟业务层的实现
 */
public class AccountServiceImpl implements IAccountService {

    //private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了");
    }

    public void init() {
        System.out.println("对象初始化了。。。");
    }

    public void destroy() {
        System.out.println("对象销毁了。。。");
    }


}
