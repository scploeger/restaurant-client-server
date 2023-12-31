package com.sploeger.restaurants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "restaurants")
// This tells the framework that this class represents each item in the restaurants collection
@Data // from lombok, creates getters, setters and toString methods
@AllArgsConstructor // creates a constructor from all private fields
@NoArgsConstructor // creates a constructor with no arguments
public class Restaurant {
    @Id // let spring framework know that this is the unique identifier for each restaurant
    private ObjectId id;
    private String restId;
    private String name;
    private String cuisine;
    private String address;
    private String phoneNum;
    private String priceRange;
    private List<String> menuItems;
    private List<String> images;
    @DocumentReference
    // this will tell the database to store only IDs of reviews, and reviews will be in a separate collection
    private List<Review> reviews;

    public Restaurant(String restId, String name, String cuisine, String address, String phoneNum, String priceRange, List<String> menuItems, List<String> images) {
        this.restId = restId;
        this.name = name;
        this.cuisine = cuisine;
        this.address = address;
        this.phoneNum = phoneNum;
        this.priceRange = priceRange;
        this.menuItems = menuItems;
        this.images = images;
    }
}
