package com.GberLabs.Islamic_Center_Backend.service;


import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailSenderServiceImpl implements EmailSenderService{

    private final JavaMailSender mailSender;

    @Override
    public String sendEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("ayoub.khatouri@usmba.ac.ma");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
       return "Mail Sent Successfully";
    }
}
