package picpay.challenge.picpay.infra.impl.user

import org.springframework.stereotype.Service
import picpay.challenge.picpay.entities.User
import picpay.challenge.picpay.infra.UserRepository
import picpay.challenge.picpay.ports.user.IUserPersistencePort

@Service
class UserPersistenceImpl(val userRepository: UserRepository) : IUserPersistencePort {
    override fun create(user: User): Int {
        val userSaved = userRepository.save(user)
        return userSaved.userId
    }

    override fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun getUserByLogin(urn:String,email:String): User? {
        return userRepository.findByURNOrEmail(urn, email)
    }

}