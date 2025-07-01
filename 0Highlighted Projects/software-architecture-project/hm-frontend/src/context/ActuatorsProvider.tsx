import React, { useReducer, useEffect } from 'react';
import {actuatorsReducer, ActuatorsContext} from "./ActuatorsContext.ts";


export const ActuatorsProvider: React.FC<{ children: React.ReactNode }> = ({ children }) => {
  const [state, dispatch] = useReducer(actuatorsReducer, { devices: [], loading: true });

  useEffect(() => {
    /*const fetchActuators = async () => {
      try {
        const response = await axios.get('/api/actuators'); // Replace with actual backend endpoint
        dispatch({ type: 'SET_ACTUATORS', actuators: response.data });
      } catch (error) {
        console.error('Error fetching actuators:', error);
      }
    };

    fetchActuators();*/
  }, []);

  return (
    <ActuatorsContext.Provider value={{ state, dispatch }}>
      {children}
    </ActuatorsContext.Provider>
  );
};


