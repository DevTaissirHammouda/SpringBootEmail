package com.example.testemail.MailSender;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class testController {

    private final EmailService emailService;

    @Operation(summary = "Endpoint to send email")
    @PostMapping("/email")
    public ResponseEntity<?> resetPassword() {
        String to = "taissir7ammouda@gmail.com";
        String code = "1234";
        emailService.sendEmail(new Mail(to, code));
        return ResponseEntity.ok("Email sent successfully");
    }
}
