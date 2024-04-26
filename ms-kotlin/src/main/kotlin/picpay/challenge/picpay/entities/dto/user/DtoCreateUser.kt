package picpay.challenge.picpay.entities.dto.user

import picpay.challenge.picpay.entities.User
import picpay.challenge.picpay.utils.UsersType

class DtoCreateUser(
    private var userType: UsersType,
    private var firstName: String,
    private var lastName: String,
    private var cpf: String,
    private var email: String,
    private var password: String
) {
    fun toUser(): User {
        return User(0,  userType, firstName, lastName, cpf, email, password)
    }
}