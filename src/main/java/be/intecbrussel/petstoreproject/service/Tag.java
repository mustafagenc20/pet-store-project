package be.intecbrussel.petstoreproject.service;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import java.util.List;

public class Tag {
    @ManyToMany
    private List<Pet> pets;
}
