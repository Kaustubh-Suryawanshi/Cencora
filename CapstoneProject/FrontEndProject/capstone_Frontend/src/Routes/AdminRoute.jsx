import React from "react"
import { Routes, Route } from 'react-router-dom'
import AdminDashboard from '../Components/AdminDashboard'
import AdminTrainList from '../Components/AdminTrainList'
import {TrainProvider} from '../Context/TrainContext'
import AddTrainForm from "../Components/AddTrainForm"
import UpdateTrainForm from "../Components/UpdateTrainForm"

const AdminRoute = () => {
    return (
        <>
            {/* <Routes>
                <Route path="/admin/" element={<LoginPage />} />
                <Route path="/signup" element={<SignupPage />} />
                <Route path="/user/addBooking/:tid" element={<PassengerDetails/>}/>
            </Routes> */}

            <TrainProvider>
                <Routes>
                    <Route path="/admin/dashboard" element={<AdminDashboard />} />
                    <Route path="/admin/trains" element={<AdminTrainList />} />
                    <Route path="/admin/addtrain" element={<AddTrainForm />} />
                    <Route path="/admin/updatetrain/:tid" element={<UpdateTrainForm />} />
                </Routes>
            </TrainProvider>
            {/* <BookingDetailsProvider>
                <Routes>
                    <Route path="/user/getbookings" element={<BookingDetails/>}/>
                </Routes>
            </BookingDetailsProvider> */}
        </>

    )
}
export default AdminRoute