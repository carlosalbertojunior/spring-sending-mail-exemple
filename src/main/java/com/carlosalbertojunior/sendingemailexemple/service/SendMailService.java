package com.carlosalbertojunior.sendingemailexemple.service;

import com.carlosalbertojunior.sendingemailexemple.dto.SendMailRequestDTO;

public interface SendMailService {

    void sendMail(SendMailRequestDTO sendMailRequestDTO);

}
