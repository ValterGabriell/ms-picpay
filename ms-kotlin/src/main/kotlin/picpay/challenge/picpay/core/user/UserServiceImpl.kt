package picpay.challenge.picpay.core.user

import org.springframework.stereotype.Service
import picpay.challenge.picpay.entities.User
import picpay.challenge.picpay.entities.dto.user.DtoCreateUser
import picpay.challenge.picpay.entities.dto.user.DtoGetUser
import picpay.challenge.picpay.ports.user.IUserPersistencePort

import picpay.challenge.picpay.ports.user.IUserServicePort


@Service
class UserServiceImpl(val iUserPersistencePort: IUserPersistencePort) :
    IUserServicePort {

    /**
     * @return userId
     */
    override fun create(createUser: DtoCreateUser): Int {
        val userByLogin = getUserByLogin(createUser.toUser().URN, createUser.toUser().email)
        if (userByLogin == null) {
            return iUserPersistencePort.create(createUser.toUser())
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
    override fun getUserByLogin(urn:String,email:String): User? {
        return iUserPersistencePort.getUserByLogin(urn, email)
    }
}