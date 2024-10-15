import axios from "axios";
import React, { useContext, useEffect } from "react";
import { BookingDetailsContext } from "../Context/BookingDetailsContext";
import { UserContext } from "../Context/UserContext";
import BookindDetailsTile from "./BookindDetailsTile";
import { useNavigate } from "react-router-dom";

const BookingDetails = () => {
  const { bookings, setBookings } = useContext(BookingDetailsContext);
  const { userID } = useContext(UserContext);

  const fetchBookings = () => {
    axios
      .get(`http://localhost:8081/booking/get/${userID}`)
      .then((response) => {
        setBookings(response.data);
      })
      .catch((err) => console.error(err));
  };
  useEffect(() => {
    fetchBookings();
  }, [userID]);

  const handleCancel = () => {
    fetchBookings();
  };

  const nav = useNavigate();

  const addbookingstyle = {
    backgroundColor: "#4f759e",
    border: "none",
    padding: "8px 12px",
    color: "white",
    cursor: "pointer",
    fontSize: "16px",
    borderRadius: "4px",
  };

  return (
    <div>
      {userID!=0 &&(
        <div
        className="addbook-button"
        style={{
          display: "flex",
          justifyContent: "center",
          marginBottom: "10px",
        }}
      >
        <button
          onClick={() => {
            nav("/search");
          }}
          style={addbookingstyle}
        >
          Add new Booking
        </button>
      </div>
      )}
      <div>
        {bookings.length > 0 ? (
          bookings.map((booking) => (
            <BookindDetailsTile
              key={booking.id}
              booking={booking}
              onCancel={handleCancel}
            />
          ))
        ) : (
          <p>No Bookings found for the selected user.</p>
        )}
      </div>
    </div>
  );
};

export default BookingDetails;
