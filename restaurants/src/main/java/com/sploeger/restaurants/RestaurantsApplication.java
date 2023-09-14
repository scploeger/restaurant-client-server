package com.sploeger.restaurants; // declaring a package

import org.springframework.boot.SpringApplication; // import Spring Application class to use run method
import org.springframework.boot.autoconfigure.SpringBootApplication; // import Spring Boot application annotation
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestaurantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantsApplication.class, args);
    }


}
