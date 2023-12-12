package com.spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.emailService.EmailService;
@RestController
public class EmailController {
	

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail() {
        String recipientEmail = "nishikanthjena@gmail.com";
        String emailSubject = "Hello";
        String emailBody = "This is a test email from Spring Boot";

        emailService.sendSimpleEmail(recipientEmail, emailSubject, emailBody);
        return "Email sent successfully!";
        
        
        
    }

}
