package picpay.challenge.picpay.entities.dto.user

import picpay.challenge.picpay.utils.UsersType

class DtoGetUser(
    val userType: UsersType,
    val firstName: String,
    val lastName: String,
    val cpf: String,
    val email: String
)