package banking.challenge.banking.utils

object Constants {
    const val REGEX_PASSWORD = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"
    const val REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}\$"
    const val REGEX_ONLY_NUMBER = "^[0-9]*\$"
}