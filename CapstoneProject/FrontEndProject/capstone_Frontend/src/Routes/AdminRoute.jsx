import React from "react"
import { Routes, Route } from 'react-router-dom'
import {TrainProvider} from '../Context/TrainContext'
import AddTrainForm from "../Components/AddTrainForm"
import UpdateTrainForm from "../Components/UpdateTrainForm"
import GetallTrains from "../Components/GetallTrains"

const AdminRoute = () => {
    return (
        <>

            <TrainProvider>
                <Routes>
                    <Route path="/admin/getTrains" element={<GetallTrains />} />
                    <Route path="/admin/addtrain" element={<AddTrainForm />} />
                    <Route path="/admin/updatetrain/:tid" element={<UpdateTrainForm />} />
                </Routes>
            </TrainProvider>
        </>

    )
}
export default AdminRoute