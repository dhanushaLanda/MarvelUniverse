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
        SuperCharacter thor = SuperCharacter.builder().id("1").name("THOR").age(100).build();
        SuperCharacter ironMan = SuperCharacter.builder().id("1").name("IRON_MAN").age(100).build();
        SuperCharacter hulk = SuperCharacter.builder().id("1").name("HULK").age(100).build();
        SuperCharacter spiderMan = SuperCharacter.builder().id("1").name("SPIDER_MAN").age(100).build();
        SuperCharacter loki = SuperCharacter.builder().id("1").name("LOKI").age(100).build();
        SuperCharacter batMan = SuperCharacter.builder().id("1").name("BAT_MAN").age(100).build();
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
