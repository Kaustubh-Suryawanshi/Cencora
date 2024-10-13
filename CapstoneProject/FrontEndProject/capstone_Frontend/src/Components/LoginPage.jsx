import React, { useContext } from 'react'
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import '../styles/loginpage.css'
import '../styles/Navbar.css'
import {UserContext} from '../Context/UserContext'

const LoginPage = () => {

const [email, setEmail] = useState('');
const [password, setPassword] = useState('');
const [role,setRole]=useState('passenger');
const {updateUserId,updateUserName}=useContext(UserContext)
  const nav = useNavigate(); // To navigate between routes

  const handleLogin = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post('http://localhost:8080/login', {
        email,
        password,
        role
      });
      if(response.data!="") {
        updateUserId(response.data.user_id);
        updateUserName(response.data.fname);
        console.log(response.data);
        nav('/user/dashboard');
    }
      else{
        console.log(response.data);
        nav('/');
      }
    } catch (error) {
      console.error('Error logging in:', error);
    }
  };

  const handleSignUpRedirect = () => {
    nav('/signup');
  };
  return (

    <div>
      {/* <h1> Welcome to Login page</h1> */}
      <div className="login-container">
      <h2>Login</h2>
      <form onSubmit={handleLogin}>
        <div>
          <label>Email:</label>
          <input
            type="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />
        </div>
        <div>
          <label>Password:</label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </div>
        <div>
          <label>Login As:</label>
          <select
            value={role}
            onChange={(e) => setRole(e.target.value)}
            required
          >
            <option value="passenger">Passenger</option>
            <option value="admin">Admin</option>
          </select>
        </div>
        <button type="submit">Login</button>
      </form>

      <p>Don't have an account?</p>
      <button onClick={handleSignUpRedirect}>Sign Up</button>
    </div>
    </div>
  )
}

export default LoginPage
