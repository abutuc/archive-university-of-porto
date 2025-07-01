import React, { createContext, useContext } from 'react';
import type { Sensor } from '../types';


interface SensorsState {
  sensors: Sensor[];
  loading: boolean;
}

type SensorsAction =
  | { type: 'SET_SENSORS'; devices: Sensor[] }
  | { type: 'ADD_SENSOR'; device: Sensor }
  | { type: 'UPDATE_SENSOR'; device: Sensor }
  | { type: 'REMOVE_SENSOR'; id: string };

export const sensorsReducer = (state: SensorsState, action: SensorsAction): SensorsState => {
  switch (action.type) {
    case 'SET_SENSORS':
      return { ...state, sensors: action.devices, loading: false };
    case 'ADD_SENSOR':
      return { ...state, sensors: [...state.sensors, action.device] };
    case 'UPDATE_SENSOR':
      return {
        ...state,
        sensors: state.sensors.map((sensor) =>
          sensor.measurementUnit === action.device.measurementUnit ? action.device : sensor
        ),
      };
    case 'REMOVE_SENSOR':
      return {
        ...state,
        sensors: state.sensors.filter((sensor) => sensor.measurementUnit !== action.id),
      };
    default:
      return state;
  }
};

export const SensorsContext = createContext<{
  state: SensorsState;
  dispatch: React.Dispatch<SensorsAction>;
}>({
  state: { sensors: [], loading: true },
  dispatch: () => null,
});



export const useSensorsContext = () => useContext(SensorsContext);
