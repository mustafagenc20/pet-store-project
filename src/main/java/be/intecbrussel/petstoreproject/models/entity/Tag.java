package be.intecbrussel.petstoreproject.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

//    @JsonBackReference
//    private Pet
}
