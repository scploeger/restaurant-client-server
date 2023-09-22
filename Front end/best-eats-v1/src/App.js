import './App.css';
import api from './api/axiosConfig';
import {useState, useEffect} from 'react';
import Layout from './components/Layout';
import {Routes, Route} from 'react-router-dom'
import Home from './components/home/Home'
import Header from './components/header/Header'
import Reviews from './components/reviews/Reviews';

function App() {

  const [restaurants, setRestaurants] = useState();
  const [restaurant, setRestaurant] = useState();
  const [reviews, setReviews] = useState();

  const getRestaurants = async () =>{

    try{

      const response = await api.get("api/v1/restaurants")

      setRestaurants(response.data)

    } catch(err){
      console.log(err);
    }

  }

  const getRestaurantData = async (restaurantId) => {
    try 
    {
        const response = await api.get(`/api/v1/restaurants/${restaurantId}`);

        const singleRestaurant = response.data;

        setRestaurant(singleRestaurant);

        setReviews(singleRestaurant.reviews);
        

    } 
    catch (error) 
    {
      console.error(error);
    }
  }

  useEffect(() => {
    getRestaurants();
  },[])

  return (
    <div className="App">
      <Header/>
      <Routes>
        <Route path="/" element={<Layout/>}>
          <Route path = "/" element={<Home restaurants={restaurants}/>}></Route>
          <Route path="/reviews/:restaurantId" element ={<Reviews getRestaurantData = {getRestaurantData} restaurant={restaurant} reviews ={reviews} setReviews = {setReviews} />}></Route>
        </Route>
      </Routes>

    </div>
  );
}

export default App;
