package com.mkit.MarvelUniverse.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ConfigurationProperties(prefix = "spring.data.mongodb")
@Configuration
@EnableMongoRepositories(basePackages = "com.mkit.MarvelUniverse")
public class MongoConfig extends AbstractMongoClientConfiguration {
    @Autowired
    private Environment env;
    private String database;
    private String uri;

    @Override
    public String getDatabaseName() {
        return database = env.getProperty("spring.data.mongodb.database");
    }

    public MongoClient mongoClient() {
        return MongoClients.create(getClientSettings());
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient(), getDatabaseName());
        return mongoTemplate;
    }
    private MongoClientSettings getClientSettings() {
        ConnectionString connectionString = new ConnectionString(env.getProperty("spring.data.mongodb.uri"));
        return MongoClientSettings.builder().applyConnectionString(connectionString).build();
    }
}


