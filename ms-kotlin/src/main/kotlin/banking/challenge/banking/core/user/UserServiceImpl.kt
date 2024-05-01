package banking.challenge.banking.core.user

import org.springframework.stereotype.Service
import banking.challenge.banking.entities.User
import banking.challenge.banking.entities.dto.bankaccount.DtoInsertMoneyToAccount
import banking.challenge.banking.entities.dto.user.DtoCreateUser
import banking.challenge.banking.entities.dto.user.DtoGetUser
import banking.challenge.banking.infra.kafka.MessageProducer
import banking.challenge.banking.ports.user.IUserPersistencePort

import banking.challenge.banking.ports.user.IUserServicePort


@Service
class UserServiceImpl(
    val iUserPersistencePort: IUserPersistencePort,
    val messageProducer: MessageProducer
) :
    IUserServicePort {

    /**
     * @return userId
     */
    override fun create(dtoUserCreate: DtoCreateUser): Int {
        val userByLogin = getUserByLogin(dtoUserCreate.toUser().URN, dtoUserCreate.toUser().email)
        if (userByLogin == null) {
            return iUserPersistencePort.create(dtoUserCreate.toUser())
        } else {
            throw Exception("Usuário já cadastrado na base de dados: ${userByLogin.URN} - ${userByLogin.email}")
        }
    }

    override fun getAll(): List<DtoGetUser> {
        return iUserPersistencePort.getAllUsers().map {
            it.toGet()
        }
    }

    /**
     * @param login -> Parametro referente ao CPF/CNPJ OU EMAIL DO USUARIO
     */
    override fun getUserByLogin(urn: String, email: String): User? {
        return iUserPersistencePort.getUserByLogin(urn, email)
    }

    override fun insertMoneyToAccount(dtoInsertMoneyToAccount: DtoInsertMoneyToAccount): String {
        messageProducer.sendMessage("user-account", dtoInsertMoneyToAccount.toString()).also {
            return "Message send"
        }
    }
}