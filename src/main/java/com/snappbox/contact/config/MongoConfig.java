package com.snappbox.contact.config;


import com.mongodb.MongoClientSettings;
import com.mongodb.MongoDriverInformation;
import com.mongodb.client.MongoClients;
import com.mongodb.client.internal.MongoClientImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

import java.net.UnknownHostException;

@Configuration
public class MongoConfig {
    private static final String MONGO_DB_URL = "localhost";
    private static final String MONGO_DB_NAME = "embeded_db";

    @Value("${spring.data.mongodb.uri}")
    String connectionString;

//    @Bean
//    public MongoDbFactory mongoDbFactory() throws UnknownHostException {
//        return new SimpleMongoClientDbFactory(new MongoClientImpl(MongoClientSettings.builder().build(), MongoDriverInformation.builder().build()), "test");
//    }
//
//    @Bean
//    public MongoOperations mongoTemplate() throws UnknownHostException{
//        return new MongoTemplate(mongoDbFactory());
//    }
    @Bean
    public MongoOperations mongoTemplate(){
        MongoOperations mongoOps = new MongoTemplate(MongoClients.create(connectionString), "test");
        return mongoOps;
    }
}
