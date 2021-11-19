package be.intecbrussel.petstoreproject.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
