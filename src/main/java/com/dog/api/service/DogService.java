package com.dog.api.service;

import com.dog.api.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();

    Dog findById(Long id);

    List<Dog> findByName(String name);

    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
