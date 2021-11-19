package be.intecbrussel.petstoreproject.models;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue
    private long id;

    private long petID;
    private long quantity;
    private OffsetDateTime shipDate;
    private String status;
    private boolean complete;
}
