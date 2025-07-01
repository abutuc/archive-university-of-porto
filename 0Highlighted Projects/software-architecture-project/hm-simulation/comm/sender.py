import json
import logging
import pika

class Send():
    def __init__(self):
        self.queue = "homemaestro"
        self.connection = None
        self.channel = None

    def connect(self):
        self.connection = pika.BlockingConnection(pika.ConnectionParameters(host='rabbitmq', port=5672))
        self.channel = self.connection.channel()
        self.channel.queue_declare(queue=self.queue, durable=True)

    def disconnect(self):
        self.connection.close()

    def send(self, message):
        message = json.dumps(message)
        logging.info("Sending message: {}".format(message))
        print("Sending message: {}".format(message))
        self.channel.basic_publish(exchange='', routing_key=self.queue, body=message)