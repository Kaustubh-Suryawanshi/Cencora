import React, { useContext, useEffect, useState } from 'react';
import TrainTile from './Traintile'; // Import the TrainTile component
import { TrainContext } from '../Context/TrainContext';
import Navbar from '../Components/Navbar'

const TrainList = () => {
    const { trains } = useContext(TrainContext);

    return (
        <>
            <Navbar />
            <div>
                {trains.length > 0 ? (
                    trains.map((train) => (
                        <TrainTile key={train.train_id} train={train} />
                    ))
                ) : (
                    <p>No trains found for the selected criteria.</p>
                )}
            </div>
        </>

    );


};

export default TrainList;
