package com.flepeng.mapper;

import com.flepeng.domain.Account;

import java.util.List;

public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();

}
