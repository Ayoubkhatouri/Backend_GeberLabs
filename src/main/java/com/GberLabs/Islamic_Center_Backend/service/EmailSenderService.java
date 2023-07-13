package com.GberLabs.Islamic_Center_Backend.service;

import jakarta.mail.MessagingException;

public interface EmailSenderService {
    int sendEmail(String toEmail ,String subject, String body) throws MessagingException;
}
