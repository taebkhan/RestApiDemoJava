package com.example.restApi.service;

import com.example.restApi.model.AccountDetails;

import java.util.List;

public interface AccountDetailService {
    List<AccountDetails> getAllAccounts();

    Boolean createAccount(AccountDetails accountDetails);

    AccountDetails updateAccountDetail(int id, AccountDetails accountDetails);

    Boolean deleteAccount(long id);
}

