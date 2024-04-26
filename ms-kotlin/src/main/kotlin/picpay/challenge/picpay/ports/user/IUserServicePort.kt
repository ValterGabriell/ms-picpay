package picpay.challenge.picpay.ports.user

import picpay.challenge.picpay.entities.User
import picpay.challenge.picpay.entities.dto.user.DtoCreateUser
import picpay.challenge.picpay.entities.dto.user.DtoGetUser

interface IUserServicePort {
    fun create(user: DtoCreateUser):Int
    fun getAll():List<DtoGetUser>
    fun getUserByLogin(urn:String,email:String): User?
}