package com.sploeger.restaurants;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "restaurant") // This tells the framework that this class represents each item in the restaurants collection
public class Restaurant {
    @Id // let spring framework know that this is the unique identifier for each restaurant
    private ObjectId id;
    private String name;
    private String cuisine;
    private String address;
    private String phoneNum;
    private String priceRange;
    private List<String> menuItems;
    private List<String> images;


}
