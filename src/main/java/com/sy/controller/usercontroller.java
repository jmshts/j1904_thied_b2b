package com.sy.controller;

import com.sy.mapper.UsersMapper;
import com.sy.pojo.Users;
import com.sy.pojo.UsersExample;
import com.sy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Random;

/**
 * Created by hx on 2019/9/16 16:53
 */
@Controller
public class usercontroller {
    @Autowired
    private UsersService usersService;
    /**
     * 传入一个email然后生成验证码并发送
     * @param email
     * @return
     */
    @RequestMapping("getCheckCode")
    @ResponseBody
    public String getCheckCode(String email, HttpSession session){
        String checkcode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message="您正在道客金服实名邮箱，验证码为:"+checkcode+"。感谢您对本平台的信任。如果不是您本人操作，请无视本信息。";
        session.setAttribute("email",email);
        try {
            usersService.sendSimpleMail(email,"道客金服邮箱验证码",message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkcode;
    }
    @RequestMapping("checkemailtrue")
    @ResponseBody
    public String checkemailtrue(String email){
        return "ok";
    }
}
