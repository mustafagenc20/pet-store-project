package be.intecbrussel.petstoreproject.models;

import javax.persistence.ManyToMany;
import java.util.List;

public class Tag {
    @ManyToMany
    private List<Pet> pets;
}
