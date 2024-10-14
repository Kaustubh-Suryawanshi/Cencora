import React, { useContext } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import {UserContext} from '../Context/UserContext'
const Navbar = () => {
    const nav= useNavigate();
    const {userName,updateUserName}=useContext(UserContext)
    const {updateUserId}=useContext(UserContext)
    // console.log(userID);
    const handleLogout=()=>{
      updateUserName('');
      updateUserId(0);
      nav('/');
    }
  return (
    <nav className="navbar">
    <div className="navbar-left">
      <h3>Welcome, {userName}!</h3>
    </div>
    <div className="navbar-right">
      <Link to="/user/getbookings" className="nav-link">My Bookings</Link>
      <Link to="/user/Profile" className="nav-link">My Profile</Link>
      <button  className="logout-btn" onClick={handleLogout}>Logout</button>
    </div>
  </nav>
  )
}

export default Navbar
