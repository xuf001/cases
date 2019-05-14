package com.springboot.cases.service;

import com.springboot.cases.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;


//    @Transactional
    public void transfer() {

        accountMapper.update(50,2);
        int i=1/0;
        accountMapper.update(60,1);
    }
}
