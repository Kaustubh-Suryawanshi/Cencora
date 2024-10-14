import React, { useContext } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import {UserContext} from '../Context/UserContext'
const AdminNavbar = () => {
    const nav= useNavigate();
    const {userName,setUserName}=useContext(UserContext)
    const {setUserId}=useContext(UserContext)
    // console.log(userID);
    const handleLogout=()=>{
      setUserName('');
      setUserId(0);
      nav('/login');
    }
  return (
    <nav className="navbar">
    <div className="navbar-left">
      <h3>Welcome, {userName}!</h3>
    </div>
    <div className="navbar-right">
      <Link to="/admin/dashboard" className="nav-link">Home</Link>
      <Link to="/admin/addtrain" className="nav-link">Add new Train</Link>
      {/* <Link to="/admin/getalltrains" className="nav-link">View All Trains</Link> */}
      <Link to="/profile" className="nav-link">My Profile</Link>
      <button  className="logout-btn" onClick={handleLogout}>Logout</button>
    </div>
  </nav>
  )
}

export default AdminNavbar
