package com.mkit.MarvelUniverse.config;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MongoConfig {
    @Autowired
    private Environment env;
//
//    @Bean
//    public MongoDatabaseFactory mongoDatabaseFactory() {
//        return new SimpleMongoClientDatabaseFactory(new ConnectionString(env.getProperty("spring.data.mongodb.uri")));
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoDatabaseFactory());
//        return mongoTemplate;
//    }
ConnectionString connectionString = new ConnectionString(env.getProperty("spring.data.mongodb.uri"));
//    MongoClientSettings settings = MongoClientSettings.builder()
//            .applyConnectionString(connectionString)
//            .build();

    MongoClient mongoClient = MongoClients.create(env.getProperty("spring.data.mongodb.uri"));
}


