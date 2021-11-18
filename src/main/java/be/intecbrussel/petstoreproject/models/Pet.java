package be.intecbrussel.petstoreproject.models;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Pet {

    @Id
    @GeneratedValue
    private Long Id;

    @ManyToOne
    private Category category;

    private String name;

    @ElementCollection
    private List<String> photoUrls;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Tag> tags;

    private String status;
}
