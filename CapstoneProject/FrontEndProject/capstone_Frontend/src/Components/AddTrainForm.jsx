import React, { useContext } from "react";
import { TrainContext } from "../Context/TrainContext";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";

const AddTrainForm = () => {
  const [formData, setFormData] = useState({
    train_no: '',
    train_name: '',
    from_source: '',
    to_destination: '',
    departure_date: '',
    arrival_date: '',
    departure_time: '',
    arrival_time: '',
    total_seats: 0,
    available_seats: 0,
    amount_per_seat:0
  });

  const nav=useNavigate();

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };
  const {setTrains}=useContext(TrainContext)

  
  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("Train Details Submitted:", formData);
    // You can handle API calls or form submission logic here
    axios.post("http://localhost:8081/admin/add",formData).then(response =>{
        console.log(response.data);
        setTrains(response.data)
        // msg that train is added
        console.log("train added");
        nav("/admin/dashboard");
    })
  };

  return (
    <div>
      <h3>Enter Train Details</h3>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Train number:</label>
          <input
            type="text"
            name="train_no"
            value={formData.train_no}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Train Name:</label>
          <input
            type="text"
            name="train_name"
            value={formData.train_name}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>from:</label>
          <input
            type="text"
            name="from_source"
            value={formData.from_source}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>to:</label>
          <input
            type="text"
            name="to_destination"
            value={formData.to_destination}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Departure date:</label>
          <input
            type="date"
            name="departure_date"
            value={formData.departure_date}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Departure time:</label>
          <input
            type="time"
            name="departure_time"
            value={formData.departure_time}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Arrival date:</label>
          <input
            type="date"
            name="arrival_date"
            value={formData.arrival_date}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Arrival time:</label>
          <input
            type="time"
            name="arrival_time"
            value={formData.arrival_time}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Total seats:</label>
          <input
            type="number"
            name="total_seats"
            value={formData.total_seats}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Available seats:</label>
          <input
            type="number"
            name="available_seats"
            value={formData.available_seats}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Amount:</label>
          <input
            type="number"
            name="amount_per_seat"
            value={formData.amount_per_seat}
            onChange={handleChange}
            required
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default AddTrainForm;
