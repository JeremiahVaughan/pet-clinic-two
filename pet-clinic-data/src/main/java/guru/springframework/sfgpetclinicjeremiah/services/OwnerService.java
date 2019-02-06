package guru.springframework.sfgpetclinicjeremiah.services;

import guru.springframework.sfgpetclinicjeremiah.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(long id);

    void save(Owner owner);

    Set<Owner> findAll();

}
