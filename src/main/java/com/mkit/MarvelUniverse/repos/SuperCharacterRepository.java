package com.mkit.MarvelUniverse.repos;

import com.mkit.MarvelUniverse.models.SuperCharacter;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SuperCharacterRepository extends MongoRepository<SuperCharacter, ObjectId> {

    Page<SuperCharacter> findAll(Pageable pegable);
}
