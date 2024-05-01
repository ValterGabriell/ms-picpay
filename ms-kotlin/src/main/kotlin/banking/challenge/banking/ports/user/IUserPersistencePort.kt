package banking.challenge.banking.ports.user

import banking.challenge.banking.entities.User

interface IUserPersistencePort {
    fun create(user: User): Int
    fun getAllUsers(): List<User>
    fun getUserByLogin(urn:String,email:String):User?
}