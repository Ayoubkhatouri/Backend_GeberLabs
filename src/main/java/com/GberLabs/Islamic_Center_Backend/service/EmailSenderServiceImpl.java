package com.GberLabs.Islamic_Center_Backend.service;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class EmailSenderServiceImpl implements EmailSenderService {

    private final JavaMailSender mailSender;

    @Override
    public int sendEmail(String toEmail, String subject, String body) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        message.setFrom("islamichubgl@gmail.com");
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
        Random random = new Random();
        int code = random.nextInt(9000) + 1000;
        message.setSubject(subject);

        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setText(body+" "+code+".", true); // true to indicate the text is HTML

        mailSender.send(message);
        return code;
    }
}
