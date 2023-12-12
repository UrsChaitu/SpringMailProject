package com.spring.project.emailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    @Autowired
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendSimpleEmail(String recipientEmail, String emailSubject, String emailBody) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(recipientEmail);
            message.setSubject(emailSubject);
            message.setText(emailBody);
            mailSender.send(message);
            System.out.println("Email sent successfully to: " + recipientEmail);
        } catch (Exception e) {
            System.err.println("Error occurred while sending email: " + e.getMessage());
            // Implement error handling as per your application's requirements
        }
    }
}
