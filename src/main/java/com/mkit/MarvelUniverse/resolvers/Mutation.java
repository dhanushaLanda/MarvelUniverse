package com.mkit.MarvelUniverse.resolvers;

import com.mkit.MarvelUniverse.models.SuperCharacter;
import com.mkit.MarvelUniverse.repos.SuperCharacterRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
//    @Autowired
    private  SuperCharacterRepository superCharacterRepository;

    public Mutation(SuperCharacterRepository superCharacterRepository) {
        this.superCharacterRepository = superCharacterRepository;
    }

    public SuperCharacter addCharacter(String name, int age){
        SuperCharacter character = SuperCharacter.builder().name(name).age(age).build();
        return superCharacterRepository.save(character);
    }

//    public SuperGroup addGroup(String name, Orientation orientation) { return superGroupRepo.addSuperGroup(name, orientation);}

}
