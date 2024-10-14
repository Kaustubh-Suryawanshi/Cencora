import React, { useContext, useState } from "react";
import Navbar from "./Navbar";

import "../styles/Dashboard.css";
import SearchTrainsComponent from "./SearchTrainsComponent";

const UserDashboardSearch = () => {
  

  return (
    <>
      <Navbar />
      <SearchTrainsComponent/>
    </>
  );
};

export default UserDashboardSearch;
