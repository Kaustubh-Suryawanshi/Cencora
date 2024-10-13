import React, { useState,useContext, useEffect } from 'react'
import { UserContext } from '../Context/UserContext'
import { useNavigate, useParams } from 'react-router-dom';
import axios from 'axios';
// import { BookingDetailsContext } from '../Context/BookingDetailsContext';
import '../styles/passenger.css'

const PassengerDetails = () => {
    const {userID}=useContext(UserContext)
    const { tid } = useParams()
    
    const [passengerDetails, setPassengerDetails] = useState({
        name: '',
        age: '',
        gender: '',
    });
    const nav=useNavigate()
    const handleChange = (e) => {
        setPassengerDetails({
            ...passengerDetails,
            [e.target.name]: e.target.value
        });
    };

    const bookingDTO={
        passenger_name:passengerDetails.name,
        passenger_age:passengerDetails.age,
        passenger_gender:passengerDetails.gender,
        train_id:parseInt(tid)
    }

    const handleSubmit=(e)=>{
        e.preventDefault();
        console.log(userID);
        axios.post(`http://localhost:8080/user/booking/add/${userID}`, bookingDTO)
        .then(response=>{
            console.log(response.data);
            nav('/user/getbookings');
        })
    }
    
    return (
    <div className="passenger-details">
            <h2>Enter Passenger Details</h2>
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    name="name"
                    placeholder="Name"
                    value={passengerDetails.name}
                    onChange={handleChange}
                    required
                />
                <input
                    type="number"
                    name="age"
                    placeholder="Age"
                    value={passengerDetails.age}
                    onChange={handleChange}
                    required
                />
                <div className="gender-options">
                    <label>
                        <input
                            type="radio"
                            name="gender"
                            value="male"
                            onChange={handleChange}
                        /> Male
                    </label>
                    <label>
                        <input
                            type="radio"
                            name="gender"
                            value="female"
                            onChange={handleChange}
                        /> Female
                    </label>
                    <label>
                        <input
                            type="radio"
                            name="gender"
                            value="other"
                            onChange={handleChange}
                        /> Other
                    </label>
                </div>
                <div className="action-buttons">
                    <button type="submit" className="pay-button" onClick={handleSubmit}>Pay and Book</button>
                </div>
            </form>
        </div>
    )
}

export default PassengerDetails
