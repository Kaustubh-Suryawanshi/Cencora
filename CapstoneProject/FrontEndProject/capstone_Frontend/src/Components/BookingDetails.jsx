import axios from 'axios'
import React, { useContext, useEffect } from 'react'
import { BookingDetailsContext } from '../Context/BookingDetailsContext'
import { UserContext } from '../Context/UserContext'
import BookindDetailsTile from './BookindDetailsTile'
import { useNavigate } from 'react-router-dom'

const BookingDetails = () => {

    const {bookings,setBookings}=useContext(BookingDetailsContext)
    const {userID}=useContext(UserContext)

    const fetchBookings = () => {
        axios.get(`http://localhost:8081/booking/get/${userID}`)
            .then(response => {
                setBookings(response.data);
            })
            .catch(err => console.error(err));
    };
    useEffect(()=>{
        fetchBookings();
    },[userID])

    const handleCancel = () => {
        fetchBookings();
    };

    const nav=useNavigate();

  return (
    <div>
        <div>
            {bookings.length > 0 ? (
                    bookings.map((booking) => (
                        <BookindDetailsTile key={booking.id} booking={booking} onCancel={handleCancel}/>
                    ))
                ) : (
                    <p>No Bookings found for the selected user.</p>
                )}
            </div>
            <div>
                <button onClick={()=>{nav('/user/dashboard')}}>Add new Booking</button>
            </div>
    </div>
  )
}

export default BookingDetails
