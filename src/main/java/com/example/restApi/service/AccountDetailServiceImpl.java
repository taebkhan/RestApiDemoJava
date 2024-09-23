package com.example.restApi.service;

import com.example.restApi.model.AccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountDetailServiceImpl implements AccountDetailService{

    Map<Long, AccountDetails> AccountDetailMap = new HashMap<>();

    @Override
    public List<AccountDetails> getAllAccounts() {
        return new ArrayList<>(AccountDetailMap.values());
    }

    @Override
    public Boolean createAccount(AccountDetails accountDetails) {
        AccountDetailMap.put(1L, accountDetails);
        return true;
    }

    @Override
    public AccountDetails updateAccountDetail(int id, AccountDetails accountDetails) {
        AccountDetailMap.put(1L, accountDetails);
        return AccountDetailMap.get(id);
    }

    @Override
    public Boolean deleteAccount(long id) {
        AccountDetailMap.remove(id);
        return true;
    }
}
