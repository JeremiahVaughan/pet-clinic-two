package guru.springframework.sfgpetclinicjeremiah.bootstrap;

import guru.springframework.sfgpetclinicjeremiah.model.Owner;
import guru.springframework.sfgpetclinicjeremiah.model.PetType;
import guru.springframework.sfgpetclinicjeremiah.model.Vet;
import guru.springframework.sfgpetclinicjeremiah.services.OwnerService;
import guru.springframework.sfgpetclinicjeremiah.services.PetTypeService;
import guru.springframework.sfgpetclinicjeremiah.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {


        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Glenna");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenannan");

        ownerService.save(owner2);

        System.out.println("Loaded Owners......");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Samantha");
        vet2.setLastName("Boulder");

        vetService.save(vet2);

        System.out.println("Loaded Vets.......");
    }
}
