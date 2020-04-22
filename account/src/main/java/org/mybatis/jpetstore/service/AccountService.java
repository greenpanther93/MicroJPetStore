/**
 * Copyright 2010-2018 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.jpetstore.service;


import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.mybatis.jpetstore.mapper.AccountMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class AccountService.
 *
 * @author Eduardo Macarron
 */
@Service
public class AccountService implements IAccountService {
    private final AccountMapper accountMapper;

    public AccountService(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    public IAccount getAccount(String username) {
        return accountMapper.getAccountByUsername(username);
    }

    public IAccount getAccount(String username, String password) {
        return accountMapper.getAccountByUsernameAndPassword(username, password);
    }

    /**
     * Insert account.
     *
     * @param account
     * 		the account
     */
    @Transactional
    public void insertAccount(IAccount account) {
        accountMapper.insertAccount(account);
        accountMapper.insertProfile(account);
        accountMapper.insertSignon(account);
    }

    /**
     * Update account.
     *
     * @param account
     * 		the account
     */
    @Transactional
    public void updateAccount(IAccount account) {
        accountMapper.updateAccount(account);
        accountMapper.updateProfile(account);
        Optional.ofNullable(account.getPassword()).filter(( password) -> (password.length()) > 0).ifPresent(( password) -> accountMapper.updateSignon(account));
    }
}

