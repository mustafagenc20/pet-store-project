package be.intecbrussel.petstoreproject.models;

import javax.persistence.OneToMany;

public class Category {
    private Integer id;
    private String name;
    @OneToMany
    public Pet pet;
}
