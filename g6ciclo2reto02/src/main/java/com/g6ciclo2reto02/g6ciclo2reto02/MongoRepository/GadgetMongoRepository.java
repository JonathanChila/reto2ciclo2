package com.g6ciclo2reto02.g6ciclo2reto02.MongoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.g6ciclo2reto02.g6ciclo2reto02.Documents.Gadget;

public interface GadgetMongoRepository extends MongoRepository<Gadget, Integer>{
    
}
