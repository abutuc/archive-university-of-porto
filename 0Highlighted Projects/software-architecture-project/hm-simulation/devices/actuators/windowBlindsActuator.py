import threading
import time
import random
import logging
from devices.actuators.strategy.realValueStrategy import RealValueStrategy
from devices.actuators.strategy.simulatedValueStrategy import SimulatedValueStrategy

class WindowBlindsActuator:
    def __init__(self, actuator_id, home_light, intensity_feature=3, strategy='real'):
        self.actuator_id = actuator_id
        self.activated = False
        self.blindsGoDown = False
        self.stop_event = threading.Event()
        self.home_light = home_light
        self.intensity_feature = intensity_feature
        self.strategy = None
        self.light = home_light
        
        self.set_strategy(strategy)

        logging.info(f"WindowBlindsActuator {self.actuator_id} initialized with home_light={home_light}, "
                     f"intensity_feature={intensity_feature}")
        
    def activate(self):
        self.activated = True
        logging.info(f"WindowBlindsActuator {self.actuator_id} activated")

    def deactivate(self):
        self.activated = False
        logging.info(f"WindowBlindsActuator {self.actuator_id} deactivated")

    def go_down(self):
        if not self.blindsGoDown and self.activated:
            self.blindsGoDown = True
            logging.info(f"WindowBlindsActuator {self.actuator_id} going down")

    def go_up(self):
        if self.blindsGoDown and self.activated:
            self.blindsGoDown = False
            logging.info(f"WindowBlindsActuator {self.actuator_id} going up")

    def set_home_light(self, home_light):
        self.home_light = home_light
        logging.info(f"WindowBlindsActuator {self.actuator_id} home_light set to {home_light}")

    def set_intensity_feature(self, intensity_feature):
        self.intensity_feature = intensity_feature
        logging.info(f"WindowBlindsActuator {self.actuator_id} intensity_feature set to {intensity_feature}")

    def set_strategy(self, strategy):
        if strategy == 'real':
            self.strategy = RealValueStrategy()
        elif strategy == 'simulated':
            self.strategy = SimulatedValueStrategy()

        logging.info(f"WindowBlindsActuator {self.actuator_id} strategy set to {strategy}")

    def generate_light(self):
        if not self.activated:
            return self.light

        value = 10 * self.intensity_feature

        if self.home_light < 100:
            new_light = self.light + random.uniform(0, value)
        elif self.home_light > 100:
            new_light = self.light - random.uniform(0, value)
        else:
            new_light = self.light

        new_light = self.strategy.generate(new_light)

        logging.info(f"WindowBlindsActuator {self.actuator_id} generated new light: {new_light}")
        return new_light
    
    def start_actuating(self, interval=3):
        def run():
            while not self.stop_event.is_set():
                if self.activated:
                    if self.home_light < 100:
                        self.go_down()
                    elif self.home_light > 100:
                        self.go_up()
                time.sleep(interval)

        self.thread = threading.Thread(target=run)
        self.thread.daemon = True
        self.thread.start()
        logging.info(f"WindowBlindsActuator {self.actuator_id} started actuating with interval {interval} seconds")

    def stop_actuating(self):
        self.activated = False
        self.stop_event.set()
        self.thread.join()
        logging.info(f"WindowBlindsActuator {self.actuator_id} stopped actuating")