package msjava.processing.transferencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProcessingTransferenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessingTransferenciaApplication.class, args);
	}

}
