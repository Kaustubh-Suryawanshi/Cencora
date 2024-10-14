import axios from "axios";
import React, { useEffect } from "react";
import { useParams } from "react-router-dom";
import { useContext } from "react";
import { TrainContext } from "../Context/TrainContext";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
const UpdateTrainForm = () => {
  const { setTrains } = useContext(TrainContext);
  const { tid } = useParams();
  const [formData, setFormData] = useState({
    train_no: "",
    train_name: "",
    from_source: "",
    to_destination: "",
    departure_date: "",
    arrival_date: "",
    departure_time: "",
    arrival_time: "",
    total_seats: 0,
    available_seats: 0,
    amount_per_seat: 0,
  });

  useEffect(() => {
    axios
      .get(`http://localhost:8081/trains/search/trainbyid/${tid}`)
      .then((response) => {
        // update the default formdata here
        const trainData = response.data;
        setFormData({
          train_no: trainData.train_no,
          train_name: trainData.train_name,
          from_source: trainData.from_source,
          to_destination: trainData.to_destination,
          departure_date: trainData.departure_date,
          arrival_date: trainData.arrival_date,
          departure_time: trainData.departure_time,
          arrival_time: trainData.arrival_time,
          total_seats: trainData.total_seats,
          available_seats: trainData.available_seats,
          amount_per_seat: trainData.amount_per_seat,
        });
      })
      .catch(console.error);
  }, []);

  const nav = useNavigate();

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .patch(`http://localhost:8081/admin/update/${tid}`,formData)
      .then((res) => {
        setTrains(res.data);
        nav("/admin/dashboard");
        // msg that update is done
      })
      .catch(console.error);
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
            disabled={true}
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
            disabled={true}
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

export default UpdateTrainForm;
