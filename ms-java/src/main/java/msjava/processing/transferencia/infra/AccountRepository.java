package msjava.processing.transferencia.infra;

import msjava.processing.transferencia.entities.account.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, Long> {

}
