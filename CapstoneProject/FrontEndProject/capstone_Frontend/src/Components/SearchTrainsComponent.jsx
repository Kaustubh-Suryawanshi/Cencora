import React, { useContext } from "react";
import { UserContext } from "../Context/UserContext";
import { useState } from "react";
import axios from "axios";
import { TrainContext } from "../Context/TrainContext";
import { useNavigate } from "react-router-dom";
const SearchTrainsComponent = () => {
  const { setTrains } = useContext(TrainContext);
  const { role } = useContext(UserContext);
  const [src, setSrc] = useState("");
  const [des, setDes] = useState("");
  const [date, setDate] = useState("");
  const [name, setName] = useState("");
  const [number, setNumber] = useState("");
  const nav = useNavigate();
  const handleSubmit = (e) => {
    e.preventDefault();
    // console.log("Details Submitted:");
    // You can handle API calls or form submission logic here
    axios
      .get(
        `http://localhost:8081/trains/search?src=${src}&des=${des}&date=${date}`
      )
      .then((response) => {
        setTrains(response.data);
        console.log(response.data);
        if (role == "passenger") nav("/user/trains");
        else if (role == "admin") nav("/admin/trains");
      })
      .catch(console.error());
  };

  const handleSubmitByname = (e) => {
    e.preventDefault();
    // console.log("Details Submitted:");
    // You can handle API calls or form submission logic here
    axios
      .get(`http://localhost:8081/trains/search/trainbyname?name=${name}`)
      .then((response) => {
        setTrains(response.data);
        console.log(response.data);
        if (role == "passenger") nav("/user/trains");
        else if (role == "admin") nav("/admin/trains");
      })
      .catch(console.error());
  };

  const handleSubmitByNumber = (e) => {
    e.preventDefault();
    // console.log("Details Submitted:");
    // You can handle API calls or form submission logic here
    axios
      .get(`http://localhost:8081/trains/search/trainbynumber?number=${number}`)
      .then((response) => {
        setTrains(response.data);
        console.log(response.data);
        if (role == "passenger") nav("/user/trains");
        else if (role == "admin") nav("/admin/trains");
      })
      .catch(console.error());
  };
  return (
    <>
      <div className="container">
        <div className="left-block">
          <h2>Search Trains</h2>
          <form className="train-search-form">
            <div className="form-group">
              <label>Source:</label>
              <input
                type="text"
                name="src"
                placeholder="Enter source"
                onChange={(e) => {
                  setSrc(e.target.value);
                }}
              />
            </div>
            <div className="form-group">
              <label>Destination:</label>
              <input
                type="text"
                name="des"
                placeholder="Enter destination"
                onChange={(e) => {
                  setDes(e.target.value);
                }}
              />
            </div>
            <div className="form-group">
              <label>Date:</label>
              <input
                type="date"
                name="date"
                onChange={(e) => {
                  setDate(e.target.value);
                }}
              />
            </div>
            <button
              type="submit"
              className="search-button"
              onClick={handleSubmit}
            >
              Search
            </button>
          </form>
        </div>

        <div className="right-block">
          <div className="top-block">
            <h2>Search Train by Name</h2>
            <form>
              <input
                type="text"
                name="train_name"
                placeholder="Enter train name"
                onChange={(e) => {
                  setName(e.target.value);
                }}
              />
              <button type="submit" onClick={handleSubmitByname}>
                Search
              </button>
            </form>
          </div>
          <div className="bottom-block">
            <h2>Search Train by Number</h2>
            <form>
              <input
                type="text"
                name="train_number"
                placeholder="Enter train number"
                onChange={(e) => {
                  setNumber(e.target.value);
                }}
              />
              <button type="submit" onClick={handleSubmitByNumber}>
                Search
              </button>
            </form>
          </div>
        </div>
      </div>
    </>
  );
};

export default SearchTrainsComponent;
