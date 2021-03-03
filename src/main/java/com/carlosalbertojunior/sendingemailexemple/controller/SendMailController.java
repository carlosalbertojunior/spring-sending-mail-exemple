package com.carlosalbertojunior.sendingemailexemple.controller;


import com.carlosalbertojunior.sendingemailexemple.dto.SendMailRequestDTO;
import com.carlosalbertojunior.sendingemailexemple.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class SendMailController {

    @Autowired
    private SendMailService sendMailService;

    @PostMapping
    public HttpStatus sendMail(@RequestBody SendMailRequestDTO sendMailRequestDTO){
        sendMailService.sendMail(sendMailRequestDTO);
        return HttpStatus.OK;
    }

}
