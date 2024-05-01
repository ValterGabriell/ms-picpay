package msjava.processing.transferencia.entities.account;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String userIdentifier;

    /*quantity of money in the account*/
    private double amount;

    public Account(String userIdentifier, double amount) {
        this.userIdentifier = userIdentifier;
        this.amount = amount;
    }

    public long getId() {
        return Id;
    }

    public String getUserIdentifier() {
        return userIdentifier;
    }

    public double getAmount() {
        return amount;
    }
}
