package com.mkit.MarvelUniverse.resolvers;

import com.mkit.MarvelUniverse.models.SuperCharacter;
import com.mkit.MarvelUniverse.models.SuperGroup;
import com.mkit.MarvelUniverse.repos.SuperCharacterRepository;
import com.mkit.MarvelUniverse.repos.SuperCharactersRepo;
import com.mkit.MarvelUniverse.repos.SuperGroupRepo;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {
    private SuperCharactersRepo superCharactersRepo;
    private SuperGroupRepo superGroupRepo;
    private SuperCharacterRepository characterRepository;

    public Query(SuperCharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<SuperCharacter> characters(){
        return characterRepository.findAll();
    }
    public Optional<SuperCharacter> characterById(String id){
        return characterRepository.findById(new ObjectId(id));
    }
    public List<SuperGroup> groups() { return superGroupRepo.getSuperGroups(); }
}
