package cn.bookcycle.panda.verify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mailController {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String EmailAddress;

    @RequestMapping(value = "/sendSimpleMail" , method = RequestMethod.POST)
    public String sendSimpleMail(@RequestParam("verifyCode") String verifyCode,
                                 @RequestParam("emailAddress") String emailAddress){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(EmailAddress);
        simpleMailMessage.setTo(emailAddress);
        simpleMailMessage.setSubject("主题：邮箱验证");
        simpleMailMessage.setText("验证码:"+verifyCode+",5分钟内填写有效");

        mailSender.send(simpleMailMessage);
        return "success";
    }
}
