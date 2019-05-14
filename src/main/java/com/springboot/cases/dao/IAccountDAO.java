package com.springboot.cases.dao;

import com.springboot.cases.entity.Account;

import java.util.List;

public interface IAccountDAO {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountByid(int id);

    List<Account> findAccountList();
}
