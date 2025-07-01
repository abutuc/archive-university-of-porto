package pt.up.feup.homemaestro.devices.sensors.data;

import org.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import pt.up.feup.homemaestro.repository.Inventory;

@Component
public class DataGeneration {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveMessage(String message) {

        JSONObject params = new JSONObject(message);

        Integer sensor_id = Integer.parseInt(params.getString("sensor_id"));
        Double value = params.getDouble("value");

        Inventory.getSensorRepository().findById(sensor_id).setMeasurementValue(value);
    }
}
