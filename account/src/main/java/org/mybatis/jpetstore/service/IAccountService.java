package org.mybatis.jpetstore.service;


public interface IAccountService {
    public IAccount getAccount(String username);

    public IAccount getAccount(String username, String password);

    public void insertAccount(IAccount account);

    public void updateAccount(IAccount account);
}

