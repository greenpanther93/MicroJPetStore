package org.mybatis.jpetstore.service;


import java.util.List;


public class InstanceDatabase {
    private static List<IAccount> accounts = new java.util.ArrayList<IAccount>();

    private static List<IAccountService> accountservices = new java.util.ArrayList<IAccountService>();

    public static int addAccountService(IAccountService accountService) {
    	accountservices.add(accountService);
    	return accountservices.size()-1;
    }
    
    public static IAccountService getAccountService(int index) {
    	return accountservices.get(index);
    }
    
    public static int addAccount(IAccount account) {
    	accounts.add(account);
    	return accounts.size()-1;
    }
    
    public static IAccount getAccount(int index) {
    	return accounts.get(index);
    }
    
}

