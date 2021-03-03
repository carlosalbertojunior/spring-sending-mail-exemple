package com.carlosalbertojunior.sendingemailexemple.service.impl;

import com.carlosalbertojunior.sendingemailexemple.dto.SendMailRequestDTO;
import com.carlosalbertojunior.sendingemailexemple.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailServiceImpl implements SendMailService {

    @Autowired
    private JavaMailSender sender;


    @Override
    public void sendMail(SendMailRequestDTO sendMailRequestDTO) {

        if (sendMailRequestDTO.getTo() == null || sendMailRequestDTO.getTo().isEmpty())
            throw new IllegalArgumentException("To value is not empty!");

        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setTo(sendMailRequestDTO.getTo());
            simpleMailMessage.setSubject(sendMailRequestDTO.getSubject());
            simpleMailMessage.setText(sendMailRequestDTO.getBody());
            sender.send(simpleMailMessage);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }


    }

}
