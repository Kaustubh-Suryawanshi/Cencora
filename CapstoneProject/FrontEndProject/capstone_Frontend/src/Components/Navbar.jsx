import React, { useContext } from 'react'
import { Link } from 'react-router-dom'
import {UserContext} from '../Context/UserContext'
const Navbar = () => {
    const {userName}=useContext(UserContext)
    const {userID}=useContext(UserContext)
    // console.log(userID);
  return (
    <nav className="navbar">
    <div className="navbar-left">
      <h3>Welcome, {userName}!</h3>
    </div>
    <div className="navbar-right">
      <Link to="/user/getbookings" className="nav-link">My Bookings</Link>
      <Link to="/profile" className="nav-link">My Profile</Link>
      <button  className="logout-btn">Logout</button>
    </div>
  </nav>
  )
}

export default Navbar
