import React, { useReducer, useEffect } from 'react';
import {hubsReducer, HubsContext} from "./HubsContext.ts";


export const HubsProvider: React.FC<{ children: React.ReactNode }> = ({ children }) => {
    const [state, dispatch] = useReducer(hubsReducer, { devices: [], loading: true });

    useEffect(() => {
        /*const fetchHubs = async () => {
          try {
            const response = await axios.get('/api/hubs'); // Replace with your backend endpoint
            dispatch({ type: 'SET_HUBS', hubs: response.data });
          } catch (error) {
            console.error('Error fetching hubs:', error);
          }
        };*/

        //fetchHubs();
    }, []);

    return (
        <HubsContext.Provider value={{ state, dispatch }}>
            {children}
        </HubsContext.Provider>
    );
};