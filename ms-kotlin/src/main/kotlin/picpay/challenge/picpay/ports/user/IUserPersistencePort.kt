package picpay.challenge.picpay.ports.user

import picpay.challenge.picpay.entities.User

interface IUserPersistencePort {
    fun create(user: User): Int
    fun getAllUsers(): List<User>
    fun getUserByLogin(urn:String,email:String):User?
}