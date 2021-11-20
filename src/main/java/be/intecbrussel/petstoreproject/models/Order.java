package be.intecbrussel.petstoreproject.models;

import be.intecbrussel.petstoreproject.service.OrderStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private long id;

    private long petId;
    private long quantity;
    private LocalDateTime shipDate;

//    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private boolean complete;
}
