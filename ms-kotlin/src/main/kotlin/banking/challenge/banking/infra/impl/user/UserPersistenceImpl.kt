package banking.challenge.banking.infra.impl.user

import org.springframework.stereotype.Service
import banking.challenge.banking.entities.User
import banking.challenge.banking.infra.UserRepository
import banking.challenge.banking.ports.user.IUserPersistencePort

@Service
class UserPersistenceImpl(val userRepository: UserRepository) : IUserPersistencePort {
    override fun create(user: User): Int {
        val userSaved = userRepository.save(user)
        return userSaved.userId
    }

    override fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun getUserByLogin(urn: String, email: String): User? {
        return userRepository.findByURNOrEmail(urn, email)
    }

}