package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.auth.AuthenticationRequest;
import com.GberLabs.Islamic_Center_Backend.auth.AuthenticationResponse;
import com.GberLabs.Islamic_Center_Backend.auth.RegisterRequest;
import com.GberLabs.Islamic_Center_Backend.service.AuthenticationService;
import com.GberLabs.Islamic_Center_Backend.service.EmailSenderService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;
    private final EmailSenderService emailSenderService;

    @PostMapping("/auth/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/auth/login")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }

    @PostMapping("/auth/sendEmail")
    public String senEmail(@RequestBody EmailSender emailSender){
           return emailSenderService.sendEmail(emailSender.toEmail,emailSender.subject,emailSender.body);
    }

}

@Data
class EmailSender{
    String toEmail;
    String subject;
    String body;
}