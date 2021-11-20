package be.intecbrussel.petstoreproject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Pet-Store Api", version = "1.0"))
public class PetStoreProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetStoreProjectApplication.class, args);
    }

}
