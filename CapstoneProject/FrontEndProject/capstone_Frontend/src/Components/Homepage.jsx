import React from "react";
import '../styles/Homepage.css'
import logo from '../image/logo.jfif'

const Homepage = () => {
  return (
    <>
      <main>
        <div class="intro">
          <h1>Nobel Trains</h1>
          <p>Welcome TO OUR Train BOOKING SYSTEM</p>
        </div>
        <div class="about-me">
          <div class="about-me-text">
            <h2>Why NobelTrains</h2>
            <p>
              spartan bus is India's largest brand for online bus ticket booking
              and offers an easy-to-use online bus and train ticket booking;
              with over 36 million satisfied customers, 3500+ bus operators to
              choose from, and plenty of offers on bus ticket booking, spartan
              bus makes road journeys super convenient for travellers. A leading
              platform for booking bus tickets, spartan bus has been the leader
              in online bus booking over the past 17 years across thousands of
              cities and lakhs of routes in India.
            </p>
          </div>
          <img src={logo} alt="me" />
        </div>
      </main>
    </>
  );
};

export default Homepage;
