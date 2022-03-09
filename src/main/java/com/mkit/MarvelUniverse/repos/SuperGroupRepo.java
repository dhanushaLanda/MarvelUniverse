package com.mkit.MarvelUniverse.repos;

import com.mkit.MarvelUniverse.models.Orientation;
import com.mkit.MarvelUniverse.models.SuperGroup;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SuperGroupRepo {
    private List<SuperGroup> superGroups = new ArrayList<>();

    public SuperGroupRepo() {
        setSuperGroups();
    }

    private void setSuperGroups() {
        SuperGroup avengers = SuperGroup.builder().name("AVENGERS").orientation(Orientation.HERO).build();
        this.superGroups.add(avengers);
    }

    public SuperGroup addSuperGroup(String name, Orientation orientation){
        SuperGroup supergroup = SuperGroup.builder().name(name).orientation(orientation).build();
        superGroups.add(supergroup);
        return supergroup;
    }
    public List<SuperGroup> getSuperGroups(){
        return this.superGroups;
    }

}
