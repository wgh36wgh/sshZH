package com.wgh.service;

import com.wgh.Dao.accountDao;
import com.wgh.domain.Account;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class AccountServiceImpl implements AccountService {
    private accountDao accountDao;
    @Override
    public void save(Account account) {
        accountDao.save(account);
    }
}
