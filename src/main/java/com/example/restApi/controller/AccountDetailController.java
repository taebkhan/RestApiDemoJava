package com.example.restApi.controller;

import com.example.restApi.model.AccountDetails;
import com.example.restApi.service.AccountDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AccountDetailController {

    @Autowired
    AccountDetailService accountDetailService;

    @GetMapping("/message")
    public String getMessage(){
        return "Displaying Account Details";
    }

    @GetMapping("/ViewAccountDetail")
    public List<AccountDetails> getAccountDetails(){
        return accountDetailService.getAllAccounts();
    }

    @PostMapping("/CreateAccount")
    public ResponseEntity<Map<String, String>> createNewAccount(@RequestBody AccountDetails accountDetails){
        accountDetailService.createAccount(accountDetails);

        Map<String, String> response = new HashMap<>();
        response.put("message", "Record Created!");

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/UpdateAccount/{id}")
    public ResponseEntity<Map<String, String>> updateAccountDetail(@PathVariable int id, @RequestBody AccountDetails accountDetail){
        accountDetailService.updateAccountDetail(id, accountDetail);

        Map<String, String> response = new HashMap<>();
        response.put("message", "Record Updated!");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("DeleteAccount/{id}")
    public String DeleteAccount(@PathVariable long id){
        accountDetailService.deleteAccount(id);
        return "Record Deleted!";
    }
}
