import React, { createContext, useState } from 'react';

export const TrainContext = createContext();

export const TrainProvider = ({ children }) => {
    const [trains, setTrains] = useState([]);


    return (
        <TrainContext.Provider value={{ trains, setTrains }}>
            {children}
        </TrainContext.Provider>
    );
};
