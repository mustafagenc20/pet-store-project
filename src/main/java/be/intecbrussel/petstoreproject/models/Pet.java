package be.intecbrussel.petstoreproject.models;
import lombok.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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

    @ElementCollection(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<String> photoUrls;

    @ManyToMany
    private List<Tag> tags;

//    @Enumerated(EnumType.STRING)
    private String status;
}
