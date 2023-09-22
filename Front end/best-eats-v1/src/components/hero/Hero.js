import './Hero.css'
import Carousel from 'react-material-ui-carousel';
import { Paper } from '@mui/material';
import { useNavigate } from 'react-router-dom';
import Button from 'react-bootstrap/Button';


const Hero = ({restaurants}) => {
    const navigate = useNavigate();
    function reviews(restaurantId){
        navigate(`/reviews/${restaurantId}`);
    }
    return (
        <div className='restaurant-carousel-container'>
            <Carousel>
                {
                    restaurants?.map((restaurant) =>{
                        return(
                            <Paper key={restaurant.restId}>
                                <div className='restaurant-card-container'>
                                    <div className="restaurant-card" style={{"--img": `url(${restaurant.images[1]})`}}>
                                        <div className='restaurant-detail'>
                                            <div className='restaurant-poster'>
                                                <img src={restaurant.images[0]} alt="" />
                                            </div>
                                            <div className='restaurant-name'>
                                                <h4>{restaurant.name}</h4>
                                            </div>
                                            <div className = "restaurant-review-button-container">
                                                <Button variant="info" onClick={() => reviews(restaurant.restId)}>Reviews</Button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </Paper>
                        )
                    })
                }
            </Carousel>
        </div>
    )
}

export default Hero;