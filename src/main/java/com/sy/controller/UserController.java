package com.sy.controller;

import com.sy.pojo.Userp;
import com.sy.service.UsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by hx on 2019/9/16 16:53
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersService usersService;

    /**
     * ajax校验注册账号是否已存在
     * @param uname 当前输入的账号
     * @return 存在返回1，不存在0
     */
    @ResponseBody
    @RequestMapping("/checkuname")
    public String checkUName(@RequestParam("uname")String uname){
        boolean b = usersService.checkUName(uname);
        return b?"1":"0";
    }

    /**
     * 注册（会员）
     * @param user 用户提交的信息
     * @return 首页或错误页
     */
    @RequestMapping("/logon")
    public String logon(Userp user, RedirectAttributes attributes){
        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getUname());//使用登录名做为salt
        //密码加密算法
        SimpleHash simpleHash = new SimpleHash("MD5", user.getPassword(), credentialsSalt, 1024);
        //存入加密后的密码
        user.setPassword(simpleHash.toString());
        boolean b = usersService.logon(user);
        if (b){
            //注册成功（成功存入数据库）后，根据账号取出数据库中的用户信息（包含uid）
            Userp user1 = usersService.findByUName(user.getUname());
            //给新建用户添加角色信息，1代表初级会员
            boolean b1 = usersService.regAddRole(user1.getUid(), 1);
            attributes.addAttribute("uid",user1.getUid());
            return b1?"redirect:main":"error";
        }
        return "error";
    }

    /**
     * 登陆的验证，shiro处理。验证通过将本次登陆时间，登陆次数+1更新到数据库
     * @param userp 登陆提交的信息（账号密码本次登录时间）
     * @param attributes 放入账号的id
     * @return 会员登陆后首页的跳转
     */
    @RequestMapping("/dealLogin")
    public String login(Userp userp, RedirectAttributes attributes){
        try{
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(userp.getUname(),userp.getPassword());
            subject.login(token);
            if (subject.isAuthenticated()){
                Userp user = usersService.findByUName(userp.getUname());
                //新建一个对象，放入用户名，提交的登陆时间，放入当前该用户登陆次数+1（查）
                Userp userp1 = new Userp();
                userp1.setUname(userp.getUname());
                userp1.setLastlogintime(userp.getLastlogintime());
                userp1.setLogintimes(user.getLogintimes()+1);
                boolean b = usersService.updateLoginTime(userp1);
                System.out.println(b);
                attributes.addAttribute("uid",user.getUid());
                return "redirect:main";
            }
        }catch (IncorrectCredentialsException e){
            System.out.println("密码错误");
        } catch (UnknownAccountException e){
            System.out.println("未知账户");
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return "redirect:login";
    }

}
