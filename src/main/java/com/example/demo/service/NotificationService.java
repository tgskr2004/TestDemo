
package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public String sendEmail(User user, String message) {
        if (user.getEmail() == null || user.getEmail().isEmpty())
            return "Invalid email";
        return "Email sent " + user.getEmail() + " with message: " + message;
    }
}
