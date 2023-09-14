package com.sploeger.restaurants;

// REST API Controller
// API layer - only concerned with task of getting a user request and returning a response

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController // annotate this class as a rest controller
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public ResponseEntity<List<Restaurant>> getRestaurants() {
        return new ResponseEntity<List<Restaurant>>(restaurantService.findAllRestaurants(), HttpStatus.OK);
    }


    @GetMapping("/{restId}")
    public ResponseEntity<Optional<Restaurant>> getSingleRestaurant(@PathVariable String restId) {
        return new ResponseEntity<Optional<Restaurant>>(restaurantService.findRestaurantByRestId(restId), HttpStatus.OK);
    }
}
