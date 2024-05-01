package banking.challenge.banking.entities

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import banking.challenge.banking.utils.UsersType


class UserTest {

    private lateinit var user: User

    @BeforeEach
    fun setup() {
        user = User(
            0, UsersType.COMUM, "Valter", "Gabriel", "03856573232",
            "emailteste@gmail.com", "Sherlock221b@"
        )
    }

    @Test
    fun validatePassword() {
        Assertions.assertThat(user.validatePassword()).isTrue();
    }

    @Test
    fun validateEmail() {
        Assertions.assertThat(user.validateEmail()).isTrue()
    }

    @Test
    fun validateURN() {
        Assertions.assertThat(user.validateURN()).isTrue()
    }

    @Test
    fun isValid(){
        Assertions.assertThat(user.isValid()).isTrue()
    }
}