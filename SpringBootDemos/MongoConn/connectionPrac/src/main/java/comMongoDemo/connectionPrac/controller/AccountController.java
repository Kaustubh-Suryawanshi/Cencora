package comMongoDemo.connectionPrac.controller;


import comMongoDemo.connectionPrac.model.Account;
import comMongoDemo.connectionPrac.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/addAccount")
    public Account addAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }

    @GetMapping("/")
    public List<Account> getAccountDetails(){
        return accountRepository.findAll();
    }

}
