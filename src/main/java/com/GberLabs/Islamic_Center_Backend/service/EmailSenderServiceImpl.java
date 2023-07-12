package com.GberLabs.Islamic_Center_Backend.service;


import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class EmailSenderServiceImpl implements EmailSenderService{

    private final JavaMailSender mailSender;

    @Override
    public int sendEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("ayoub.khatouri@usmba.ac.ma");
        message.setTo(toEmail);
        Random random = new Random();
        int code = random.nextInt(9000) + 1000;
        message.setText(body+" "+code+".");
        message.setSubject(subject);
        mailSender.send(message);
       return code;
    }
}
