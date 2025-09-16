# Real time Notifications System Simulation
A basic real-time notifications system using WebSockets in Spring Boot.

## How It Works (Detailed Explanation)

### 1. WebSocket Configuration
Spring Boot uses a configuration class (usually named `WebSocketConfig.java`) to enable and set up WebSocket support.
- It defines the endpoint (e.g., `/ws/notifications`) that clients connect to.
- It configures a message broker (often using STOMP protocol) to route messages between server and clients.

### 2. Client Connection
Frontend clients (such as a web page using JavaScript) connect to the WebSocket endpoint.
- Once connected, the server and client maintain an open channel for communication.
- The client subscribes to a topic (e.g., `/topic/notifications`) to receive messages.

### 3. Sending Notifications
A REST controller (e.g., `NotificationController.java`) exposes an API endpoint.
- When triggered (for example, by an HTTP POST request), it sends a notification message directly to the topic using Spring’s messaging template.

### 4. Broadcasting Messages
The REST controller uses Spring’s `SimpMessagingTemplate` (or similar) to send messages to all subscribed clients.
- The message is sent to the topic, and all connected clients instantly receive the notification.

### 5. Receiving Notifications
On the frontend, the client listens for messages from the server.
- When a notification arrives, it can be displayed in real time (e.g., as a popup or alert).

### Why WebSockets?
- **Instant updates:** No need for clients to poll the server repeatedly.
- **Efficient:** Reduces network overhead compared to HTTP polling.
- **Bidirectional:** Both server and client can send messages at any time.


  Here are the snapshots of the working:
  
  Admin's Side:
<img width="823" height="376" alt="image" src="https://github.com/user-attachments/assets/37511348-1b4a-4ddf-85ce-bbbd72b253c0" />



  Client's Side:
 <img width="1035" height="702" alt="image" src="https://github.com/user-attachments/assets/ef356066-07be-4997-938a-81ebeea3e5ab" />


## Summary
This simulation shows how Spring Boot and WebSockets work together to deliver real-time notifications.  
It’s ideal for learning or demonstrating instant communication in web applications.
