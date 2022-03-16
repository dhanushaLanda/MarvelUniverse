package com.mkit.MarvelUniverse;

import com.mkit.MarvelUniverse.repos.SuperCharactersRepo;
import com.mkit.MarvelUniverse.resolvers.Mutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableMongoRepositories(basePackageClasses = SuperCharacterRepository.class)
public class MarvelUniverseApplication {

    @Autowired
    private SuperCharactersRepo superCharacterRepository;

//    @Bean
//    public Query query(){
//        return new Query(superCharacterRepository);
//    }
    @Bean
    public Mutation mutation(){
        return new Mutation(superCharacterRepository);
    }
    public static void main(String[] args) {
        SpringApplication.run(MarvelUniverseApplication.class, args);
    }
}
