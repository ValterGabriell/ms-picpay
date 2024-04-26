package picpay.challenge.picpay.adapter.user

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import picpay.challenge.picpay.entities.dto.user.DtoCreateUser
import picpay.challenge.picpay.entities.dto.user.DtoGetUser
import picpay.challenge.picpay.ports.user.IUserServicePort

@RestController(value = "api/v1/")
class UserController(val iUserServicePort: IUserServicePort) {

    @PostMapping()
    fun createNewUser(@RequestBody createUser: DtoCreateUser): ResponseEntity<Int> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(iUserServicePort.create(createUser))

    }

    @GetMapping
    fun getAllUsers(): ResponseEntity<List<DtoGetUser>> {
        return ResponseEntity.ok(iUserServicePort.getAll())
    }
}