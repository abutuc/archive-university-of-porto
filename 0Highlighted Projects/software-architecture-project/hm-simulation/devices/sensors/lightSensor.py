import threading
import time
import random
import logging

from comm.sender import Send

class LightSensor:
    def __init__(self, sensor_id, home_light=200.0):
        self.sensor_id = sensor_id
        self.light = home_light
        self.activated = False
        self.stop_event = threading.Event()

        self.sender = Send()
        self.sender.connect()

    def update_home_light(self, home_light):
        self.light = home_light
        logging.info(f"Updated home light for sensor: {self.sensor_id} to: {home_light} lux")

    def generate_light(self):
        return self.light + random.uniform(-10, 10) # Error that the light sensor may have

    def activate(self):
        self.activated = True

    def deactivate(self):
        self.activated = False

    def send_light(self):
        if not self.activated:
            return
        
        self.light = self.generate_light()

        message = {
            'type': 'light',
            'sensor_id': self.sensor_id,
            'value': self.light
        }

        self.sender.send(message)
        print(f"Sent light: {self.light} lux from sensor: {self.sensor_id}")
        logging.info(f"Sent light: {self.light} lux from sensor: {self.sensor_id}")

    def start_sending(self, interval=3):
        def run():
            while not self.stop_event.is_set():
                if self.activated:
                    self.send_light()
                time.sleep(interval)

        self.thread = threading.Thread(target=run)
        self.thread.daemon = True
        self.thread.start()

    def stop_sending(self):
        self.activated = False
        self.stop_event.set()
        self.thread.join()