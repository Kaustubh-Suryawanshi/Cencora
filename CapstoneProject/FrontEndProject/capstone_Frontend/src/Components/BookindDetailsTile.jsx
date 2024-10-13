import React from 'react'
import '../styles/BookingDetailsTile.css'
import axios from 'axios';

const BookindDetailsTile = ({booking, onCancel }) => {
    const formattedBookingDate = new Date(booking.booking_date).toLocaleDateString();

    const handleCancelBooking = () => {
        axios.post(`http://localhost:8081/booking/cancel/${booking.id}`)
            .then(() => {
                onCancel(); // Trigger refresh in BookingDetails
            })
            .catch(err => console.error(err));
    };
  return (
    <div className="booking-tile">
            <div className="booking-header">
                <h3>{booking.train_no} - {booking.train_name}</h3>
            </div>
            <div className="booking-info">
                <div className="left-info">
                    <p><strong>Passenger Name:</strong> {booking.passenger_name}</p>
                    <p><strong>Passenger Age:</strong> {booking.passenger_age}</p>
                    <p><strong>Passenger Gender:</strong> {booking.passenger_gender}</p>
                </div>
                <div className="right-info">
                    <p><strong>Booking Date:</strong>{formattedBookingDate}</p>
                    <p><strong>Departure Date:</strong> {booking.departure_date}</p>
                    <p><strong>Departure Time:</strong> {booking.departure_time}</p>
                </div>
            </div>
            <div className="booking-actions">
                <button className="cancel-button" onClick={handleCancelBooking}>Cancel Booking</button>
            </div>
        </div>
  )
}

export default BookindDetailsTile
