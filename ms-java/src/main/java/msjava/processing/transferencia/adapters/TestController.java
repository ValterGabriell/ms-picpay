package msjava.processing.transferencia.adapters;

import msjava.processing.transferencia.entities.account.Account;
import msjava.processing.transferencia.infra.AccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class TestController {

    private final AccountRepository accountRepository;

    public TestController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @PostMapping
    public ResponseEntity<String> insertNewData() {
        Account account = new Account("03856573232", 8563);
        Account insert = accountRepository.insert(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(insert.getUserIdentifier());
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAll(){
        List<Account> accounts = accountRepository.findAll();
        return ResponseEntity.ok(accounts);
    }

}
