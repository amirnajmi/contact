package com.snappbox.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.snappbox.contact.repository")
@Import({ org.springdoc.core.SpringDocDataRestConfiguration.class})
public class ContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}

//	@Bean
//	ModelMapper modelMapper(){
//		return new ModelMapper();
//	}

}
