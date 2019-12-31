package com.snappbox.contact.config;

import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.snappbox.contact.repository")
public class MongoConfig {

    @Bean
    public MongoOperations mongoTemplate(){
        MongoOperations mongoOps = new MongoTemplate(MongoClients.create(), "test");
        return mongoOps;
    }

}
