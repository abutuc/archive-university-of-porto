import { Client } from "@stomp/stompjs";
import sockjs from "sockjs-client/dist/sockjs";

// URL of the WebSocket endpoint
const SOCKET_URL = "http://localhost/api/homemaestro";

class WebSocketService {
  client: any;
  constructor() {
    this.client = null;
  }

  connect(onMessageReceived: any) {
    this.client = new Client({
      webSocketFactory: () => new sockjs(SOCKET_URL), // Use SockJS to connect
      debug: function (str) {
        // console.log(str);
      },
      reconnectDelay: 5000, // Reconnect after 5 seconds if connection is lost
      heartbeatIncoming: 4000, // Frequency of incoming heartbeats
      heartbeatOutgoing: 4000, // Frequency of outgoing heartbeats
    });

    this.client.onConnect = () => {
      console.log("Connected to WebSocket server");

      // Subscribe to topics
      this.client.subscribe("/topic/sensorValues", (message: any) => {
        onMessageReceived("sensorValues", JSON.parse(message.body));
      });

      this.client.subscribe("/topic/sensorStates", (message: any) => {
        onMessageReceived("sensorStates", JSON.parse(message.body));
      });

      this.client.subscribe("/topic/actuatorStates", (message: any) => {
        onMessageReceived("actuatorStates", JSON.parse(message.body));
      });

      this.client.subscribe("/topic/actuatorLastCommands", (message: any) => {
        onMessageReceived("actuatorCommands", JSON.parse(message.body));
      });
    };

    this.client.onStompError = (frame: any) => {
      console.error("Broker reported error: ", frame.headers["message"]);
      console.error("Additional details: ", frame.body);
    };

    this.client.activate();
  }

  disconnect() {
    if (this.client) {
      this.client.deactivate();
      console.log("Disconnected from WebSocket server");
    }
  }
}

const webSocketService = new WebSocketService();
export default webSocketService;
