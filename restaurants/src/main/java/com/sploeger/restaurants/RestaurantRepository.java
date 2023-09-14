package com.sploeger.restaurants;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, ObjectId> {
    Optional<Restaurant> findRestaurantByRestId(String restId);
}
