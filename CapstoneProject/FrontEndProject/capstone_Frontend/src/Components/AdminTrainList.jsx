import React, { useEffect } from "react";
import AdminTrainTile from "./AdminTrainTile";
import { useContext } from "react";
import { TrainContext } from "../Context/TrainContext";
import { useNavigate } from "react-router-dom";
import AdminNavbar from "./AdminNavbar";

const AdminTrainList = ({}) => {
  const { trains, setTrains } = useContext(TrainContext);
  useEffect(() => {
    setTrains(trains);
  }, [trains]);
  const nav = useNavigate();
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
    <>
    <AdminNavbar/>
      <div>
        {trains.length > 0 ? (
          trains.map((train) => (
            <AdminTrainTile
              key={train.train_id}
              train={train}
              updateTrains={setTrains}
            />
          ))
        ) : (
          <p>No trains found for the selected criteria.</p>
        )}
      </div>
    </>
  );
};

export default AdminTrainList;
