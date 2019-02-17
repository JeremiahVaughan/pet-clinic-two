package guru.springframework.sfgpetclinicjeremiah.repositories;

import guru.springframework.sfgpetclinicjeremiah.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
