package be.intecbrussel.petstoreproject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product API", version = "2.0", description = "Product Information"))
public class PetStoreProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetStoreProjectApplication.class, args);
    }

}
