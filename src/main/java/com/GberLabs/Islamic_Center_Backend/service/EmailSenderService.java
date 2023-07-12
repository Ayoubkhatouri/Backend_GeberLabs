package com.GberLabs.Islamic_Center_Backend.service;

public interface EmailSenderService {
    int sendEmail(String toEmail ,String subject, String body);
}
