package com.mkit.MarvelUniverse.repos;

import com.mkit.MarvelUniverse.models.SuperCharacter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SuperCharactersRepo {
    private List<SuperCharacter> superCharacters = new ArrayList<SuperCharacter>();

    public SuperCharactersRepo() { setSuperCharacters(); }
    private void setSuperCharacters() {
        SuperCharacter captainAmerica = SuperCharacter.builder().id("1").name("CAPTAIN_AMERICA").age(100).build();
        this.superCharacters.add(captainAmerica);
    }
    public List<SuperCharacter> getSuperCharacters() {
        return this.superCharacters;
    }

    public SuperCharacter getCharacterById(String id) {
        return this.superCharacters.stream().filter(superCharacter -> superCharacter.getId().equals(id)).collect(Collectors.toList()).get(0);
    }

    public SuperCharacter addCharacter(String name, int age){
        SuperCharacter characterToBeAdded = SuperCharacter.builder().name(name).age(age).id("Char" + superCharacters.size() + 1).build();
        this.superCharacters.add(characterToBeAdded);
        return characterToBeAdded;
    }
}
