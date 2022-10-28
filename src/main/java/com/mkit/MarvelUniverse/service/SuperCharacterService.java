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
    private int pageNumber = 0;
    public Page<SuperCharacter> fetchAll(){
        pageNumber = pageNumber==5 ? 0 : pageNumber;
        Page<SuperCharacter> page = superCharacterRepository.findAll(PageRequest.of(pageNumber++, 3, Sort.by("name")));
        System.out.println("total number of pages:"+page.getTotalPages());

        return page;
    }
}
