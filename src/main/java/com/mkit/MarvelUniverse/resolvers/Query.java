package com.mkit.MarvelUniverse.resolvers;

import com.mkit.MarvelUniverse.models.SuperCharacter;
import com.mkit.MarvelUniverse.models.SuperGroup;
import com.mkit.MarvelUniverse.repos.SuperCharacterRepository;
import com.mkit.MarvelUniverse.repos.SuperGroupRepo;
import com.mkit.MarvelUniverse.service.SuperCharacterService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {
//    private SuperCharactersRepo characterRepository;
    private SuperGroupRepo superGroupRepo;
    private SuperCharacterRepository characterRepository;
    private SuperCharacterService service;

    public Query(SuperCharacterService service) {
        this.service = service;
    }

    public Page<SuperCharacter> characters(){
        return service.fetchAll();
    }
    public Optional<SuperCharacter> characterById(String id){
        return characterRepository.findById(new ObjectId(id));
    }
    public List<SuperGroup> groups() { return superGroupRepo.getSuperGroups(); }
}
