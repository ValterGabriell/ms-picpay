package banking.challenge.banking.entities.dto.bankaccount

data class DtoInsertMoneyToAccount(
    private val userId: Int,
    private val amount: Double
)