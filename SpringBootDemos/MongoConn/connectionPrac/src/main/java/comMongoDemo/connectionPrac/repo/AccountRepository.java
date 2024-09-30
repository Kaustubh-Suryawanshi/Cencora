package comMongoDemo.connectionPrac.repo;

import comMongoDemo.connectionPrac.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account,String> {
}
