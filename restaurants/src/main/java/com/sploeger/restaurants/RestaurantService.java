package com.sploeger.restaurants;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    @Autowired // tells spring that we want to instantiate this RestuaurantRepository class
    private RestaurantRepository repository;

    public List<Restaurant> findAllRestaurants() {
        return repository.findAll();
    }

    public Optional<Restaurant> findRestaurantByRestId(String restId) {
        return repository.findRestaurantByRestId(restId);
    }
}
