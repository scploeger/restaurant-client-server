package com.sploeger.restaurants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository repository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String restId) {
        Review review = repository.insert(new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now()));

        mongoTemplate.update(Restaurant.class) // use template to perform update call on restaurant class
                .matching(Criteria.where("restId").is(restId)) //update restaurant with restId in database matches one received from user
                .apply(new Update().push("reviews").value(review))
                .first();

        return review;
    }
}
