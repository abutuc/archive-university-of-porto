import React, {createContext, useContext} from "react";
import type {Hub} from "../types.ts";

// Define the state shape for Hubs
interface HubsState {
    devices: Hub[];
    loading: boolean;
}

// Define the possible actions for the reducer
type HubsAction =
    | { type: 'SET_HUBS'; devices: Hub[] }
    | { type: 'ADD_HUB'; device: Hub }
    | { type: 'REMOVE_HUB'; id: string };

// Define the reducer function to manage the state
export const hubsReducer = (state: HubsState, action: HubsAction): HubsState => {
    switch (action.type) {
        case 'SET_HUBS':
            return {...state, devices: action.devices, loading: false};
        case 'ADD_HUB':
            return {...state, devices: [...state.devices, action.device]};
        case 'REMOVE_HUB':
            return {
                ...state,
                devices: state.devices.filter((hub) => hub.id !== action.id),
            };
        default:
            return state;
    }
};

// Initialize the context
export const HubsContext = createContext<{
    state: HubsState;
    dispatch: React.Dispatch<HubsAction>;
}>({
    state: {devices: [], loading: true},
    dispatch: () => {
        throw new Error("dispatch function must be overridden");
    },
});

// Create a custom hook to use the HubsContext
export const useHubsContext = () => useContext(HubsContext);