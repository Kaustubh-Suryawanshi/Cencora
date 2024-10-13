import React, { useContext, useState } from 'react'
import Navbar from './Navbar'
import axios from 'axios';
import { TrainContext } from '../Context/TrainContext';
import { useNavigate } from 'react-router-dom';

const UserDashboardSearch = () => {
    const {setTrains} = useContext(TrainContext);
    const [src, setSrc] = useState('');
    const [des, setDes] = useState('');
    const [date, setDate] = useState('');
    const nav=useNavigate();
    const handleSubmit = (e) => {
        e.preventDefault();
        // console.log("Details Submitted:");
        // You can handle API calls or form submission logic here
        axios.get(`http://localhost:8081/train/search/listoftrains?src=${src}&des=${des}&date=${date}`).then(response => {
            setTrains(response.data);
            console.log(response.data);
            nav('/user/trains')
        }).catch(console.error());
    }

    return (


        <>
            <Navbar />
            <div>
                <input type="text" name='src' onChange={e => setSrc(e.target.value)} placeholder='Enter Source' required />
                <input type='text' name='des' onChange={e => setDes(e.target.value)} placeholder='Enter Destination' required/>
                <input type='date' name='date' onChange={e => setDate(e.target.value)} required/>
                <input type='submit' onClick={handleSubmit} name='search'/>
            </div>
        </>
    )
}

export default UserDashboardSearch
