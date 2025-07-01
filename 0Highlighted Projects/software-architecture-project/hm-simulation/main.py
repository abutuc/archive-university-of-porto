import threading
import time
import random
import logging
from flask import Flask, request, jsonify

from home import Home
from devices.sensors.temperatureSensor import TemperatureSensor
from devices.sensors.lightSensor import LightSensor
from devices.hubs.zigbeeHub import ZigbeeHub
from devices.actuators.fanActuator import FanActuator
from devices.actuators.windowBlindsActuator import WindowBlindsActuator

app = Flask(__name__)
home = Home()
sensors = []
hubs = []
actuators = []

def update_home(home):
    original_temperature = home.get_temperature()
    original_light = home.get_light()

    while True:
        # add a small variation to the temperature and light, simulating the real environment
        # if no actuator is on this will make it go back to the original temperature and light
        if home.get_temperature() - original_temperature > 0:
            new_temperature = home.get_temperature() + random.uniform(-0.3, 0)
        elif home.get_temperature() - original_temperature < 0:
            new_temperature = home.get_temperature() + random.uniform(0, 0.3)
        else:
            new_temperature = home.get_temperature() + random.uniform(-0.3, 0.3)

        if home.get_light() - original_light > 0:
            new_light = home.get_light() + random.uniform(-10, 0)
        elif home.get_light() - original_light < 0:
            new_light = home.get_light() + random.uniform(0, 10)
        else:
            new_light = home.get_light() + random.uniform(-10, 10)
        
        home.set_temperature(new_temperature)
        home.set_light(new_light)

        for sensor in sensors:
            # Update the home temperature or light for each sensor
            if isinstance(sensor, TemperatureSensor):
                sensor.update_home_temperature(new_temperature)
            elif isinstance(sensor, LightSensor):
                sensor.update_home_light(home.get_light())

        for actuator in actuators:
            if isinstance(actuator, FanActuator):
                actuator.set_home_temperature(new_temperature)
                home.set_temperature(actuator.generate_temperature())
            elif isinstance(actuator, WindowBlindsActuator):
                actuator.set_home_light(new_light)
                home.set_light(actuator.generate_light())

        time.sleep(5)

        logging.info(f"Updated HOME temperature to: {new_temperature}")
        logging.info(f"Updated HOME light to: {new_light}")
        print(f"Updated HOME temperature to: {new_temperature}")
        print(f"Updated HOME light to: {new_light}")

@app.route('/health')
def health():
    return jsonify({"status": "UP"})

@app.route('/simulation/sensor/temperature/<sensor_id>/activate', methods=['POST'])
def activate_temperature_sensor(sensor_id):
    for sensor in sensors:
        if sensor.sensor_id == sensor_id:
            sensor.activate()
            return jsonify({"message": "Sensor activated", "sensor_id": sensor_id})
    return jsonify({"message": "Sensor not found", "sensor_id": sensor_id}), 404

@app.route('/simulation/sensor/temperature/<sensor_id>/deactivate', methods=['POST'])
def deactivate_temperature_sensor(sensor_id):
    for sensor in sensors:
        if sensor.sensor_id == sensor_id:
            sensor.deactivate()
            return jsonify({"message": "Sensor deactivated", "sensor_id": sensor_id})
    return jsonify({"message": "Sensor not found", "sensor_id": sensor_id}), 404

@app.route('/simulation/sensor/temperature/<sensor_id>', methods=['POST'])
def add_temperature_sensor(sensor_id):
    sensor = TemperatureSensor(sensor_id=sensor_id)
    sensor.update_home_temperature(home.get_temperature())
    sensor.start_sending()
    sensors.append(sensor)
    return jsonify({"message": "Sensor added", "sensor_id": sensor_id})

@app.route('/simulation/sensor/temperature/<sensor_id>', methods=['DELETE'])
def remove_temperature_sensor(sensor_id):
    for sensor in sensors:
        if sensor.sensor_id == sensor_id:
            sensor.stop_sending()
            sensors.remove(sensor)
            return jsonify({"message": "Sensor removed", "sensor_id": sensor_id})
    return jsonify({"message": "Sensor not found", "sensor_id": sensor_id}), 404

@app.route('/simulation/sensor/light/<sensor_id>/activate', methods=['POST'])
def activate_light_sensor(sensor_id):
    for sensor in sensors:
        if sensor.sensor_id == sensor_id:
            sensor.activate()
            return jsonify({"message": "Sensor activated", "sensor_id": sensor_id})
    return jsonify({"message": "Sensor not found", "sensor_id": sensor_id}), 404

@app.route('/simulation/sensor/light/<sensor_id>/deactivate', methods=['POST'])
def deactivate_light_sensor(sensor_id):
    for sensor in sensors:
        if sensor.sensor_id == sensor_id:
            sensor.deactivate()
            return jsonify({"message": "Sensor deactivated", "sensor_id": sensor_id})
    return jsonify({"message": "Sensor not found", "sensor_id": sensor_id}), 404

@app.route('/simulation/sensor/light/<sensor_id>', methods=['POST'])
def add_light_sensor(sensor_id):
    sensor = LightSensor(sensor_id=sensor_id)
    sensor.update_home_light(home.get_light())
    sensor.start_sending()
    sensors.append(sensor)
    return jsonify({"message": "Sensor added", "sensor_id": sensor_id})

@app.route('/simulation/sensor/light/<sensor_id>', methods=['DELETE'])
def remove_light_sensor(sensor_id):
    for sensor in sensors:
        if sensor.sensor_id == sensor_id:
            sensor.stop_sending()
            sensors.remove(sensor)
            return jsonify({"message": "Sensor removed", "sensor_id": sensor_id})
    return jsonify({"message": "Sensor not found", "sensor_id": sensor_id}), 404

@app.route('/simulation/hub/zigbee/<hub_id>', methods=['POST'])
def add_zigbee_hub(hub_id):
    hub = ZigbeeHub(hub_id=hub_id)
    hubs.append(hub)
    return jsonify({"message": "Hub added", "hub_id": hub_id})

@app.route('/simulation/hub/zigbee/<hub_id>', methods=['DELETE'])
def remove_zigbee_hub(hub_id):
    for hub in hubs:
        if hub.hub_id == hub_id:
            hubs.remove(hub)
            return jsonify({"message": "Hub removed", "hub_id": hub_id})
    return jsonify({"message": "Hub not found", "hub_id": hub_id}), 404

@app.route('/simulation/hub/zigbee/<hub_id>/activate', methods=['POST'])
def activate_zigbee_hub(hub_id):
    for hub in hubs:
        if hub.hub_id == hub_id:
            hub.activate()
            return jsonify({"message": "Hub activated", "hub_id": hub_id})
    return jsonify({"message": "Hub not found", "hub_id": hub_id}), 404

@app.route('/simulation/hub/zigbee/<hub_id>/deactivate', methods=['POST'])
def deactivate_zigbee_hub(hub_id):
    for hub in hubs:
        if hub.hub_id == hub_id:
            hub.deactivate()
            return jsonify({"message": "Hub deactivated", "hub_id": hub_id})
    return jsonify({"message": "Hub not found", "hub_id": hub_id}), 404

@app.route('/simulation/actuator/fan/<actuator_id>', methods=['POST'])
def add_fan_actuator(actuator_id):
    actuator = FanActuator(actuator_id=actuator_id, home_temperature=home.get_temperature())
    actuator.start_actuating()
    actuators.append(actuator)
    return jsonify({"message": "Actuator added", "actuator_id": actuator_id})

@app.route('/simulation/actuator/fan/<actuator_id>', methods=['DELETE'])
def remove_fan_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.stop_actuating()
            actuators.remove(actuator)
            return jsonify({"message": "Actuator removed", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/fan/<actuator_id>/activate', methods=['POST'])
def activate_fan_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.activate()
            return jsonify({"message": "Actuator activated", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/fan/<actuator_id>/deactivate', methods=['POST'])
def deactivate_fan_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.deactivate()
            return jsonify({"message": "Actuator deactivated", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/fan/<actuator_id>/temperature', methods=['POST'])
def set_fan_actuator_temperature(actuator_id):
    temperature = request.json.get('temperature')
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.set_temperature_feature(temperature)
            return jsonify({"message": "Temperature set", "actuator_id": actuator_id, "temperature": temperature})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/fan/<actuator_id>/intensity', methods=['POST'])
def set_fan_actuator_intensity(actuator_id):
    intensity = request.json.get('intensity')
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.set_intensity_feature(intensity)
            return jsonify({"message": "Intensity set", "actuator_id": actuator_id, "intensity": intensity})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/fan/<actuator_id>/turn-on', methods=['POST'])
def turn_on_fan_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.turn_on()
            return jsonify({"message": "Fan turned on", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/fan/<actuator_id>/turn-off', methods=['POST'])
def turn_off_fan_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.turn_off()
            return jsonify({"message": "Fan turned off", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/fan/<actuator_id>/increase-intensity', methods=['POST'])
def increase_intensity_fan_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.increase_intensity()
            return jsonify({"message": "Increased fan intensity", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/fan/<actuator_id>/decrease-intensity', methods=['POST'])
def decrease_intensity_fan_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.decrease_intensity()
            return jsonify({"message": "Decreased fan intensity", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404


@app.route('/simulation/actuator/window-blinds/<actuator_id>', methods=['POST'])
def add_window_blinds_actuator(actuator_id):
    actuator = WindowBlindsActuator(actuator_id=actuator_id, home_light=home.get_light())
    actuator.start_actuating()
    actuators.append(actuator)
    return jsonify({"message": "Actuator added", "actuator_id": actuator_id})

@app.route('/simulation/actuator/window-blinds/<actuator_id>', methods=['DELETE'])
def remove_window_blinds_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.stop_actuating()
            actuators.remove(actuator)
            return jsonify({"message": "Actuator removed", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/window-blinds/<actuator_id>/activate', methods=['POST'])
def activate_window_blinds_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.activate()
            return jsonify({"message": "Actuator activated", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/window-blinds/<actuator_id>/deactivate', methods=['POST'])
def deactivate_window_blinds_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.deactivate()
            return jsonify({"message": "Actuator deactivated", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/window-blinds/<actuator_id>/light', methods=['POST'])
def set_window_blinds_actuator_light(actuator_id):
    light = request.json.get('light')
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.set_home_light(light)
            return jsonify({"message": "Light set", "actuator_id": actuator_id, "light": light})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/window-blinds/<actuator_id>/intensity', methods=['POST'])
def set_window_blinds_actuator_intensity(actuator_id):
    intensity = request.json.get('intensity')
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.set_intensity_feature(intensity)
            return jsonify({"message": "Intensity set", "actuator_id": actuator_id, "intensity": intensity})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/window-blinds/<actuator_id>/go-down', methods=['POST'])
def go_down_window_blinds_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.go_down()
            return jsonify({"message": "Window blinds going down", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404

@app.route('/simulation/actuator/window-blinds/<actuator_id>/go-up', methods=['POST'])
def go_up_window_blinds_actuator(actuator_id):
    for actuator in actuators:
        if actuator.actuator_id == actuator_id:
            actuator.go_up()
            return jsonify({"message": "Window blinds going up", "actuator_id": actuator_id})
    return jsonify({"message": "Actuator not found", "actuator_id": actuator_id}), 404


def run_flask():
    app.run(host='0.0.0.0', port=5000)

if __name__ == '__main__':
    update_temp_thread = threading.Thread(target=update_home, args=(home,))
    update_temp_thread.daemon = True
    update_temp_thread.start()

    flask_thread = threading.Thread(target=run_flask)
    flask_thread.daemon = True
    flask_thread.start()

    # # Add a temperature sensor
    # sensor = TemperatureSensor(sensor_id="temp_sensor_1")
    # sensor.update_home_temperature(home.get_temperature())
    # sensor.start_sending()
    # sensors.append(sensor)
    # # Add a light sensor
    # sensor = LightSensor(sensor_id="light_sensor_1")
    # sensor.update_home_light(home.get_light())
    # sensor.start_sending()
    # sensors.append(sensor)

    # # Add a Zigbee Hub
    # hub = ZigbeeHub(hub_id="zigbee_hub_1")
    # hubs.append(hub)

    # # Add a Fan Actuator
    # actuator = FanActuator(actuator_id="fan_actuator_1", home_temperature=home.get_temperature())
    # actuator.start_actuating()
    # actuators.append(actuator)

    # # Add a Window Blinds Actuator
    # actuator = WindowBlindsActuator(actuator_id="window_blinds_actuator_1", home_light=home.get_light())
    # actuator.start_actuating()
    # actuators.append(actuator)

    # Keep the main thread alive to allow the Flask app and sensor updates to keep running
    while True:
        time.sleep(1)