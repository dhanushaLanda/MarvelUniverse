package com.mkit.MarvelUniverse.repos;

import com.mkit.MarvelUniverse.models.SuperCharacter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SuperCharacterRepository extends MongoRepository<SuperCharacter, ObjectId> {
}
