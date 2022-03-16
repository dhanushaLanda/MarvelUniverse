package com.mkit.MarvelUniverse.service;

import com.mkit.MarvelUniverse.models.SuperCharacter;
import com.mkit.MarvelUniverse.repos.SuperCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class SuperCharacterService {
    @Autowired
    SuperCharacterRepository superCharacterRepository;

    public Page<SuperCharacter> fetchAll(){
        return superCharacterRepository.findAll(PageRequest.of(0,5, Sort.by("name")));
    }
}
