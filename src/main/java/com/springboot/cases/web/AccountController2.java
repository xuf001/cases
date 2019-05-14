package com.springboot.cases.web;

import com.springboot.cases.service.AccountService;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/account")
@MapperScan(value = {"com.springboot.cases.dao"})
public class AccountController2 {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "transfer",method = RequestMethod.GET)
    public void transfer(){
        accountService.transfer();
    }
}
