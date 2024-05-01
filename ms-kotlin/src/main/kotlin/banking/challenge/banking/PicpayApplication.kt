package banking.challenge.banking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackages = ["picpay.challenge.picpay"])
class PicpayApplication
fun main(args: Array<String>) {
	runApplication<PicpayApplication>(*args)
}
