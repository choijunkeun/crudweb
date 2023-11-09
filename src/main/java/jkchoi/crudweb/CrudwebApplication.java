package jkchoi.crudweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudwebApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrudwebApplication.class, args);
	}

}
