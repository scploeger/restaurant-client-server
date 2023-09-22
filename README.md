# restaurant-reviews

A restaurant review application. Includes front end, back end and database.

**Database:** MongoDB  
**Back end:** Java and Spring Boot  
**Front end:** React

*Back end*  
The backend application is divided into three layers, the service layer, the data access layer, and the API layer. The backend is created using Java and Spring Boot.

*Front end*  
The front end is created with ReactJS. It uses HTTPS GET requests to communicate with the MongoDB database and POST requests to update data on the server side. 

## To run:

1. Create a free cluster on MongoDB Atlas https://www.mongodb.com/atlas/database
2. Download MongoDB compass (https://www.mongodb.com/products/compass), connect it with your cluster, and point it to
   the `restaurants.json` file
3. (optional) Update or add to the restaurants.json file
4. You will need to make your own `.env` file based on `.example.env` within `src/main/java/resources
5. Open the back end code in IntelliJ and run it
6. Navigate to the front end code location in a terminal window and run the app using `$ npm build`

## To-do

- [x] Create a restaurant class with
- [x] Create setters and getters for all restaurant attributes
- [x] Finish making endpoints for all attributes
- [x] Begin development on the front end
- [x] Complete front end

## Credits

Adapted from this guide: https://youtu.be/5PdEmeopJVQ