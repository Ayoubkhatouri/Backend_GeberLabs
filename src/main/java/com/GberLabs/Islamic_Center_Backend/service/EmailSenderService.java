package com.GberLabs.Islamic_Center_Backend.service;

public interface EmailSenderService {
    String sendEmail(String toEmail ,String subject, String body);
}
