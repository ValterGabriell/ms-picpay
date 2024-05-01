package banking.challenge.banking.entities.dto.user

import banking.challenge.banking.utils.UsersType

class DtoGetUser(
    val userType: UsersType,
    val firstName: String,
    val lastName: String,
    val cpf: String,
    val email: String
)