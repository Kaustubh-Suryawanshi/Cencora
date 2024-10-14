import React, { useContext, useState } from 'react'
import Navbar from './Navbar'
import axios from 'axios';
import { TrainContext } from '../Context/TrainContext';
import { useNavigate } from 'react-router-dom';
import AdminNavbar from './AdminNavbar';
import "../styles/Dashboard.css";
import SearchTrainsComponent from './SearchTrainsComponent';
const AdminDashboard = () => {

    return (
        <>
            <AdminNavbar />
            <SearchTrainsComponent/>
        </>
    )
}

export default AdminDashboard
