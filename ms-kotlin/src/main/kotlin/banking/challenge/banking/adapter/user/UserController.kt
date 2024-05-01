package banking.challenge.banking.adapter.user

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import banking.challenge.banking.entities.dto.bankaccount.DtoInsertMoneyToAccount
import banking.challenge.banking.entities.dto.user.DtoCreateUser
import banking.challenge.banking.entities.dto.user.DtoGetUser
import banking.challenge.banking.ports.user.IUserServicePort

@RestController
@RequestMapping("/api/v1/")
class UserController(val iUserServicePort: IUserServicePort) {


    @PostMapping
    fun createNewUser(@RequestBody createUser: DtoCreateUser): ResponseEntity<Int> {
        val userCreatedId = iUserServicePort.create(createUser)
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(userCreatedId)
    }

    @PostMapping("account-money")
    fun insertMoneyToAccount(@RequestBody dtoInsertMoneyToAccount: DtoInsertMoneyToAccount): ResponseEntity<String> {
        val message = iUserServicePort.insertMoneyToAccount(dtoInsertMoneyToAccount)
        return ResponseEntity.ok(message)
    }

    @GetMapping
    fun getAllUsers(): ResponseEntity<List<DtoGetUser>> {
        return ResponseEntity.ok(iUserServicePort.getAll())
    }
}