package com.sy.service.Impl;

import com.sy.mapper.UsersMapper;
import com.sy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by hx on 2019/9/16 20:29
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Value("${spring.mail.username}")
    private String from;
    @Autowired
    private JavaMailSender mailSender;
    /**
     * @方法名: sendSimpleMail
     * @参数名：@param subject  邮件主题
     * @参数名：@param content 邮件主题内容
     * @参数名：@param from        发件人Email地址
     * @参数名：@param to         收件人Email地址
     * @描述语: 发送邮件
     */
    public void sendSimpleMail(String to,String title,String content){
        //创建要发送的邮件
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(title);
        message.setText(content);
        mailSender.send(message);
    }
}
