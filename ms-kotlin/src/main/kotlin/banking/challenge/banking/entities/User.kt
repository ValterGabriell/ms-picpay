package banking.challenge.banking.entities

import jakarta.persistence.*
import org.intellij.lang.annotations.Pattern
import banking.challenge.banking.entities.dto.user.DtoGetUser
import banking.challenge.banking.utils.Constants
import banking.challenge.banking.utils.UsersType

@Entity(name = "sy001")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var userId: Int,

    @Enumerated(EnumType.STRING)
    @Pattern(value = "COMUM|LOJISTA")
    var userType: UsersType,

    var firstName: String,
    var lastName: String,

    /** URN = Unique Register Number = CPF - CNPJ **/
    var URN: String,

    var email: String,
    var password: String
) {
    fun validatePassword(): Boolean {
        val regex = Constants.REGEX_PASSWORD.toRegex()
        return this.password.isNotEmpty() && this.password.matches(regex) && this.password.length > 8
    }

    fun validateEmail(): Boolean {
        val regex = Constants.REGEX_EMAIL.toRegex()
        return this.email.isNotEmpty() && this.email.matches(regex)
    }

    fun validateURN(): Boolean {
        val regex = Constants.REGEX_ONLY_NUMBER.toRegex()

        return this.URN.isNotEmpty() &&
                this.URN.matches(regex) &&
                (this.URN.length == 11 || this.URN.length == 14)
    }

    fun toGet(): DtoGetUser {
        return DtoGetUser(
            userType, firstName, lastName, URN, email
        )
    }

    fun isValid(): Boolean {
        return this.URN.isNotEmpty() || this.email.isNotEmpty()
    }
}