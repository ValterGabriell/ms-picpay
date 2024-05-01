package banking.challenge.banking.ports.user

import banking.challenge.banking.entities.User
import banking.challenge.banking.entities.dto.bankaccount.DtoInsertMoneyToAccount
import banking.challenge.banking.entities.dto.user.DtoCreateUser
import banking.challenge.banking.entities.dto.user.DtoGetUser

interface IUserServicePort {
    fun create(dtoUserCreate: DtoCreateUser):Int
    fun getAll():List<DtoGetUser>
    fun getUserByLogin(urn:String,email:String): User?
    fun insertMoneyToAccount(dtoInsertMoneyToAccount: DtoInsertMoneyToAccount):String
}