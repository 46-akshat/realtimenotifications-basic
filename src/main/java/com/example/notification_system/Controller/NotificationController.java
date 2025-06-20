package com.example.notification_system.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {
  @MessageMapping("/sendmessage")
  @SendTo("/topic/annotation")
    public String sendMessage(String message){
         System.out.println("message: "+message);
         return message;
    }
}
