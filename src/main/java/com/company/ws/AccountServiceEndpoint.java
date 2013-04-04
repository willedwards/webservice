package com.company.ws;/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 12:48
 */


import com.company.api.AccountService;
import com.company.bo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName="AccountService")
public class AccountServiceEndpoint extends SpringBeanAutowiringSupport {

    @Autowired
    private AccountService biz;

    @WebMethod
    public void insertAccount(Account acc) {
       biz.insertAccount(acc);
    }

    @WebMethod
    public List<Account> getAccounts(String name) {

        return biz.getAccounts(name);
    }
}
