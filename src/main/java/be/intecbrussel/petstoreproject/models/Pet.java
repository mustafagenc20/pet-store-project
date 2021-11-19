package be.intecbrussel.petstoreproject.models;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pet {

    @Id
    @GeneratedValue
    private Long Id;

    @ManyToOne
    private Category category;
    private String name;

    private List<String> photoUrls;

    @ManyToMany
    private List<Tag> tags;

    private String status;
}
