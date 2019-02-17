package guru.springframework.sfgpetclinicjeremiah.repositories;

import guru.springframework.sfgpetclinicjeremiah.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
