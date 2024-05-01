package banking.challenge.banking.infra

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import banking.challenge.banking.entities.User

@Repository
interface UserRepository : MongoRepository<User, Int> {
    fun findByURNOrEmail(@Param("URN") urn: String, @Param("email") email:String): User?
}