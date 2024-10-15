import React, { useContext, useEffect } from "react";
import { TrainContext } from "../Context/TrainContext";
import axios from "axios";
import { UserContext } from "../Context/UserContext";
import { useNavigate } from "react-router-dom";
import TrainList from "./TrainList";

const GetallTrains = () => {
  const { trains, setTrains } = useContext(TrainContext);
  const { userID,userName } = useContext(UserContext);
  const nav = useNavigate();
  useEffect(() => {
    const fetchUser = async () => {
      try {
        const response = await axios.get(
          `http://localhost:8081/trains/search/alltrains`
        );
        setTrains(response.data);
      } catch (err) {
        console.log(err.message);
      }
    };

    fetchUser();
  }, [trains]);

  const addButtonStyle = {
    backgroundColor: "#007bff",
    color: "white",
    padding: "10px 15px",
    border: "none",
    borderRadius: "5px",
    cursor: "pointer",
    fontSize: "1rem",
    transition: "background-color 0.2s ease-in-out",
  };
  return (
    <div>
      {userID != 0 && (
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
              if (userName === "admin") nav("/admin/addtrain");
              else nav("/login");
            }}
            style={addButtonStyle}
          >
            Add new Train
          </button>
        </div>
      )}
      <TrainList />
    </div>
  );
};

export default GetallTrains;
