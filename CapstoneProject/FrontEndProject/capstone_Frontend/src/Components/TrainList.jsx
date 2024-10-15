import React, { useContext, useEffect, useState } from 'react';
import TrainTile from './Traintile'; // Import the TrainTile component
import { TrainContext } from '../Context/TrainContext';


const TrainList = () => {
    const { trains,setTrains } = useContext(TrainContext);
    useEffect(() => {
        setTrains(trains);
      }, [trains]);

    return (
        <>
            <div>
                {trains.length > 0 ? (
                    trains.map((train) => (
                        <TrainTile key={train.train_id} train={train} updateTrains={setTrains}/>
                    ))
                ) : (
                    <p>No trains found for the selected criteria.</p>
                )}
            </div>
        </>

    );


};

export default TrainList;
