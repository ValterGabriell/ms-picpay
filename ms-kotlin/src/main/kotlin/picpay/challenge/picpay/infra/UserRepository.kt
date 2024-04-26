package picpay.challenge.picpay.infra

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import picpay.challenge.picpay.entities.User

@Repository
interface UserRepository : JpaRepository<User, Int> {
    fun findByURNOrEmail(@Param("URN") urn: String, @Param("email") email:String): User?
}