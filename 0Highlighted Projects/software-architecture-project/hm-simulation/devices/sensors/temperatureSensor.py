import threading
import time
import random
import logging

from comm.sender import Send

class TemperatureSensor:
    def __init__(self, sensor_id, home_temperature=15.0):
        self.sensor_id = sensor_id
        self.temperature = home_temperature
        self.activated = False
        self.stop_event = threading.Event()

        self.sender = Send()
        self.sender.connect()

    def update_home_temperature(self, home_temperature):
        self.temperature = home_temperature
        logging.info(f"Updated home temperature for sensor: {self.sensor_id} to: {home_temperature}°C")

    def generate_temperature(self):
        return self.temperature + random.uniform(-0.15, 0.15)

    def activate(self):
        self.activated = True

    def deactivate(self):
        self.activated = False

    def send_temperature(self):
        if not self.activated:
            return
        
        self.temperature = self.generate_temperature()

        message = {
            'type': 'temperature',
            'sensor_id': self.sensor_id,
            'value': self.temperature
        }

        self.sender.send(message)
        print(f"Sent temperature: {self.temperature}°C from sensor: {self.sensor_id}")
        logging.info(f"Sent temperature: {self.temperature}°C from sensor: {self.sensor_id}")

    def start_sending(self, interval=3):
        def run():
            while not self.stop_event.is_set():
                if self.activated:
                    self.send_temperature()
                time.sleep(interval)

        self.thread = threading.Thread(target=run)
        self.thread.daemon = True
        self.thread.start()

    def stop_sending(self):
        self.activated = False
        self.stop_event.set()
        self.thread.join()