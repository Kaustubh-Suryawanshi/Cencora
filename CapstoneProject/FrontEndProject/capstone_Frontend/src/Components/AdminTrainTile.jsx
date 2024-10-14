import React, { useEffect } from "react";
import { useNavigate } from "react-router-dom";
import "../styles/AdminTrainTile.css";
import axios from "axios";

const AdminTrainTile = ({ train,updateTrains }) => {
  const nav=useNavigate();
  const fetchTrainsAfterDeletion=()=>{
    axios.post(`http://localhost:8081/admin/delete/${train.train_id}`)
    .then((res)=>{
        updateTrains(res);
    }).catch((console.error))
  }

  

  const deleteHanlder=(e)=>{
    e.preventDefault();
    fetchTrainsAfterDeletion();
  }

  const updateHandler=(e)=>{
    e.preventDefault();
    nav(`/admin/updatetrain/${train.train_id}`)
  }
  
  return (
    <div className="train-tile">
      {/* Top Section - Train No and Name */}
      <div className="train-header">
        <h3>
          {train.train_no} - {train.train_name}
        </h3>
      </div>

      {/* Middle Section - Source, Destination, and Journey Time */}
      <div className="train-details">
        <div className="train-source">
          <p>
            <strong>From:</strong> {train.from_source}
          </p>
          <p>
            <strong>Departure:</strong> {train.departure_date} at{" "}
            {train.departure_time}
          </p>
        </div>

        <div className="train-destination">
          <p>
            <strong>To:</strong> {train.to_destination}
          </p>
          <p>
            <strong>Arrival:</strong> {train.arrival_date} at{" "}
            {train.arrival_time}
          </p>
        </div>
      </div>

      {/* Bottom Section - Available Seats, Amount, and Book Button */}
      <div className="train-footer">
        <div className="train-seats">
          <p>
            <strong>Total Seats:</strong> {train.total_seats}
          </p>
          <p>
            <strong>Available Seats:</strong> {train.available_seats}
          </p>
        </div>

        <div className="train-amount">
          <p>
            <strong>Amount per Seat:</strong> ₹
            {train.amount_per_seat.toFixed(2)}
          </p>
        </div>

        <div className="train-buttons">
          <div className="train-update">
            <button className="update-button" onClick={updateHandler}>update Train</button>
          </div>
          <div className="train-delete">
            <button className="delete-button" onClick={deleteHanlder}>Delete Train</button>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AdminTrainTile;
