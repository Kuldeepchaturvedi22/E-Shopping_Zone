package com.notificationservice.service;


import com.notificationservice.dto.NotificationDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("{spring.mail.username}")
    private String sender;

    SimpleMailMessage mailMessage = new SimpleMailMessage();

    public ResponseEntity<?> sendMail(NotificationDetails details) {
        mailMessage.setFrom(sender);
        mailMessage.setTo(details.getRecipient());
        mailMessage.setSubject(details.getSubject());
        mailMessage.setText(details.getMsgBody());

        javaMailSender.send(mailMessage);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    public ResponseEntity<?> registerUser(String email) {
        mailMessage.setFrom(sender);
        String subject="Welcome to Our Application";
        String body="Dear user, Thank you for registering";
        mailMessage.setSubject(subject);
        mailMessage.setText(body);
        mailMessage.setTo(email);
        javaMailSender.send(mailMessage);
        return new ResponseEntity<>(true,HttpStatus.OK);
    }

}
