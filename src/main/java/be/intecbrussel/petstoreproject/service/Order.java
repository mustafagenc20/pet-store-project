package be.intecbrussel.petstoreproject.service;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.OffsetDateTime;

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
