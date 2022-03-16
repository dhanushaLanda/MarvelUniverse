package com.mkit.MarvelUniverse.resolvers;

import com.mkit.MarvelUniverse.models.SuperCharacter;
import com.mkit.MarvelUniverse.repos.SuperCharactersRepo;
import graphql.kickstart.tools.GraphQLMutationResolver;

//@Component
public class Mutation implements GraphQLMutationResolver {
    private SuperCharactersRepo superCharacterRepository;

    public Mutation(SuperCharactersRepo superCharacterRepository) {
        this.superCharacterRepository = superCharacterRepository;
    }

    public SuperCharacter addCharacter(String name, int age){
//        SuperCharacter character = SuperCharacter.builder().name(name).age(age).build();
        return superCharacterRepository.addCharacter(name,age);
    }

//    public SuperGroup addGroup(String name, Orientation orientation) { return superGroupRepo.addSuperGroup(name, orientation);}

}
