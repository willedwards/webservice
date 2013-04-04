package com.company.impl;

import com.company.Account;
import com.company.api.AccountService;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 12:51
 */

public class AccountServiceImpl implements AccountService
{
    private static final Logger log =  Logger.getLogger(AccountServiceImpl.class);

    private List<Account> dbList = new ArrayList<Account>();

    public void insertAccount(Account acc) {
        log.info("inserted an account");

        dbList.add(acc);
    }

    public List<Account> getAccounts(String name) {

        List<Account> accountsWithSameName = new ArrayList<Account>();
        for(Account acc : dbList)
        {
            if(acc.getName().equals(name))
            {
                accountsWithSameName.add(acc);
            }
        }
        return accountsWithSameName;
    }
}
