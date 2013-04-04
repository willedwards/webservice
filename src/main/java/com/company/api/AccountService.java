package com.company.api;

import com.company.Account;

import java.util.List;

/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 12:51
 */

public interface AccountService {

    public void insertAccount(Account account);

    public List<Account> getAccounts(String name);
}
