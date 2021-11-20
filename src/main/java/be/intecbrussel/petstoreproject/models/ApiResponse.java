package be.intecbrussel.petstoreproject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;


@Getter
@Setter
public class ApiResponse {

    private Integer code;
    private String type;
    private String message;

    public ApiResponse() {
    }

    public ApiResponse(Integer code, String type, String message) {
        this.code = code;
        this.type = type;
        this.message = message;
    }
}
