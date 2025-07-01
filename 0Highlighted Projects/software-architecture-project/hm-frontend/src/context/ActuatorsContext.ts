import React, {createContext, useContext} from "react";
import type {Actuator} from "../types.ts";

// Define the state shape for Hubs
interface ActuatorsState {
    devices: Actuator[];
    loading: boolean;
}

type ActuatorsAction =
    | { type: 'SET_ACTUATORS'; devices: Actuator[] }
    | { type: 'ADD_ACTUATOR'; device: Actuator }
    | { type: 'REMOVE_ACTUATOR'; protocol: string };

// Define the reducer function to manage the state
export const actuatorsReducer = (state: ActuatorsState, action: ActuatorsAction): ActuatorsState => {
    switch (action.type) {
        case 'SET_ACTUATORS':
            return {...state, devices: action.devices, loading: false};
        case 'ADD_ACTUATOR':
            return {...state, devices: [...state.devices, action.device]};
        case 'REMOVE_ACTUATOR':
            return {
                ...state,
                devices: state.devices.filter((actuator) => actuator.protocol.name !== action.protocol),
            };
        default:
            return state;
    }
};

export const ActuatorsContext = createContext<{
    state: ActuatorsState;
    dispatch: React.Dispatch<ActuatorsAction>;
}>({
    state: {devices: [], loading: true},
    dispatch: () => null,
});

// Create a custom hook to use the HubsContext
export const useActuatorsContext = () => useContext(ActuatorsContext);