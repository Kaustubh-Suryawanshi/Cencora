import React from "react"
import { Routes, Route } from 'react-router-dom'
import LoginPage from "../Components/LoginPage"
import SignupPage from "../Components/SignupPage"
import UserDashboardSearch from "../Components/UserDashboardSearch"
import TrainList from "../Components/TrainList"
import { TrainProvider } from "../Context/TrainContext"
import PassengerDetails from "../Components/PassengerDetails"
import { BookingDetailsProvider } from "../Context/BookingDetailsContext"
import BookingDetails from "../Components/BookingDetails"

const UserRoute = () => {
    return (
        <>
            <Routes>
                <Route path="/" element={<LoginPage />} />
                <Route path="/signup" element={<SignupPage />} />
                <Route path="/user/addBooking/:tid" element={<PassengerDetails/>}/>
                {/* <Route path="/user/profile" element={<ProfileDetails/>}/> */}
            </Routes>

            <TrainProvider>
                <Routes>
                    <Route path="/user/dashboard" element={<UserDashboardSearch />} />
                    <Route path="/user/trains" element={<TrainList />} />
                </Routes>
            </TrainProvider>
            <BookingDetailsProvider>
                <Routes>
                    <Route path="/user/getbookings" element={<BookingDetails/>}/>
                </Routes>
            </BookingDetailsProvider>
        </>

    )
}
export default UserRoute