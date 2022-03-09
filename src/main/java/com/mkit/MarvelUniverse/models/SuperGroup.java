package com.mkit.MarvelUniverse.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SuperGroup {
    private String name;
    private List<SuperCharacter> superGroupMembers;
    private Orientation orientation;


}
