package com.example.beautyboutique.Services;

import com.example.beautyboutique.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public  String sendEmail(String email,String subject,String body){
        SimpleMailMessage message =new SimpleMailMessage();
        message.setTo(email);
        message.setFrom("hnphong37m1@gmail.com");
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
        return body;
    }


}
