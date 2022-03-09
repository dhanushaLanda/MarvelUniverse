package com.mkit.MarvelUniverse;

import com.mkit.MarvelUniverse.repos.SuperCharacterRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = SuperCharacterRepository.class)
public class MarvelUniverseApplication {


//    @Bean
//    public Query query(){
//        return new Query(superCharacterRepository);
//    }
//    @Bean
//    public Mutation mutation(){
//        return new Mutation(superCharacterRepository);
//    }
    public static void main(String[] args) {
        SpringApplication.run(MarvelUniverseApplication.class, args);
    }
}
