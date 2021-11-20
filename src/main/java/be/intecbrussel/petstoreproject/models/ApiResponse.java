package be.intecbrussel.petstoreproject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

//@Entity
@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
public class ApiResponse {

    private Integer code;
    private String type;
    private String message;
}
