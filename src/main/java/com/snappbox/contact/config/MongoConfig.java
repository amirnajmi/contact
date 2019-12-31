package com.snappbox.contact.config;


import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Value("${spring.data.mongodb.uri}")
    String connectionString;

    @Bean
    public MongoOperations mongoTemplate(){
        MongoOperations mongoOps = new MongoTemplate(MongoClients.create(connectionString), "test");
        return mongoOps;
    }
}
