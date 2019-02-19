package guru.springframework.sfgpetclinicjeremiah.services.map;

import guru.springframework.sfgpetclinicjeremiah.model.Visit;
import guru.springframework.sfgpetclinicjeremiah.services.VisitService;

import java.util.Set;

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long along) {
        super.deleteById(along);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
            return super.save(visit);
        }
    }

    @Override
    public Visit findById(Long aLong) {
        return super.findByID(aLong);
    }
}
