import React, {useEffect, useReducer} from "react";
import {sensorsReducer, SensorsContext} from "./SensorsContext.ts";

export const SensorsProvider: React.FC<{ children: React.ReactNode }> = ({ children }) => {
    const [state, dispatch] = useReducer(sensorsReducer, { sensors: [], loading: true });

    useEffect(() => {
        /*const fetchSensors = async () => {
          try {
            const response = await axios.get('/api/sensors'); // Replace with actual endpoint
            dispatch({ type: 'SET_SENSORS', sensors: response.data });
          } catch (error) {
            console.error('Error fetching sensors:', error);
          }
        };*/

        //fetchSensors();
    }, []);

    return (
        <SensorsContext.Provider value={{ state, dispatch }}>
            {children}
        </SensorsContext.Provider>
    );
};