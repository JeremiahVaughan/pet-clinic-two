package guru.springframework.sfgpetclinicjeremiah.services;

import guru.springframework.sfgpetclinicjeremiah.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);

    void save(Vet owner);

    Set<Vet> findAll();
}
