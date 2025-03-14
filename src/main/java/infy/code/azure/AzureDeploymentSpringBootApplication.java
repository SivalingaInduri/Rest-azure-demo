package infy.code.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDeploymentSpringBootApplication {
    @GetMapping("/message")
    public String message() {
        return " app deployed successfully..";
    }

    public static void main(String[] args) {
        SpringApplication.run(AzureDeploymentSpringBootApplication.class, args);
    }

}
