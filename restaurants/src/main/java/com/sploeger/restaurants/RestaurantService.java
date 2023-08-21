package com.sploeger.restaurants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RestaurantService {
    @Autowired // tells spring that we want to instantiate this RestuaurantRepository class
    private RestaurantRepository restaurantRepository;
    public List<Restaurant> allRestaurants(){
        return restaurantRepository.findAll(); //
    }
}
