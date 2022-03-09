package com.mkit.MarvelUniverse.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("SuperCharacter")
@Builder
@Data
public class SuperCharacter {
    private String name;
    @Id
    private String id;
    private int age;
}
