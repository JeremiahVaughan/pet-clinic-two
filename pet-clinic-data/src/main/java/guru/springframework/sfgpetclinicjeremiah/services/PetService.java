package guru.springframework.sfgpetclinicjeremiah.services;

import guru.springframework.sfgpetclinicjeremiah.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);

    void save(Pet owner);

    Set<Pet> findAll();
}
