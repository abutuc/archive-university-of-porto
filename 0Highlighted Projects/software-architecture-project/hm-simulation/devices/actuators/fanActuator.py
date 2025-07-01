import threading
import time
import random
import logging
from devices.actuators.strategy.realValueStrategy import RealValueStrategy
from devices.actuators.strategy.simulatedValueStrategy import SimulatedValueStrategy

class FanActuator:
    def __init__(self, actuator_id, home_temperature, temperature_feature=20.0, intensity_feature=3, strategy='real'):
        self.actuator_id = actuator_id
        self.activated = False
        self.isOn = False
        self.stop_event = threading.Event()
        self.home_temperature = home_temperature
        self.temperature_feature = temperature_feature
        self.intensity_feature = intensity_feature
        self.strategy = None
        self.temperature = home_temperature

        self.set_strategy(strategy)

        logging.info(f"FanActuator {self.actuator_id} initialized with home_temperature={home_temperature}, "
                     f"temperature_feature={temperature_feature}, intensity_feature={intensity_feature}")

    def activate(self):
        self.activated = True
        logging.info(f"FanActuator {self.actuator_id} activated")

    def deactivate(self):
        self.activated = False
        logging.info(f"FanActuator {self.actuator_id} deactivated")

    def turn_on(self):
        if not self.isOn and self.activated:
            self.isOn = True
            logging.info(f"FanActuator {self.actuator_id} turned on")

    def turn_off(self):
        if self.isOn and self.activated:
            self.isOn = False
            logging.info(f"FanActuator {self.actuator_id} turned off")

    def increase_intensity(self):
        self.intensity_feature += 1
        print(f"FanActuator {self.actuator_id} intensity increased")

    def decrease_intensity(self):
        if self.intensity_feature > 0:
            self.intensity_feature -= 1
            print(f"FanActuator {self.actuator_id} intensity decreased")

    
    def set_home_temperature(self, home_temperature):
        self.home_temperature = home_temperature
        logging.info(f"FanActuator {self.actuator_id} home_temperature set to {home_temperature}")

    def set_temperature_feature(self, temperature_feature):
        self.temperature_feature = temperature_feature
        logging.info(f"FanActuator {self.actuator_id} temperature_feature set to {temperature_feature}")

    def set_intensity_feature(self, intensity_feature):
        self.intensity_feature = intensity_feature
        logging.info(f"FanActuator {self.actuator_id} intensity_feature set to {intensity_feature}")

    def set_strategy(self, strategy):
        if strategy == 'real':
            self.strategy = RealValueStrategy()
        elif strategy == 'simulated':
            self.strategy = SimulatedValueStrategy()

        logging.info(f"FanActuator {self.actuator_id} strategy set to {strategy}")

    def generate_temperature(self):
        if not self.activated and not self.isOn:
            return self.temperature

        value = 0.1 * self.intensity_feature

        if self.home_temperature < self.temperature_feature:
            new_temperature = self.temperature + random.uniform(0, value)
        elif self.home_temperature > self.temperature_feature:
            new_temperature = self.temperature - random.uniform(0, value)
        else:
            new_temperature = self.temperature

        new_temperature = self.strategy.generate(new_temperature)

        logging.info(f"FanActuator {self.actuator_id} generated temperature {new_temperature}")
        return new_temperature

    def start_actuating(self, interval=3):
        def run():
            while not self.stop_event.is_set():
                if self.activated:
                    self.temperature = self.generate_temperature()
                time.sleep(interval)

        self.thread = threading.Thread(target=run)
        self.thread.daemon = True
        self.thread.start()
        logging.info(f"FanActuator {self.actuator_id} started actuating with interval {interval} seconds")

    def stop_actuating(self):
        self.activated = False
        self.stop_event.set()
        self.thread.join()
        logging.info(f"FanActuator {self.actuator_id} stopped actuating")