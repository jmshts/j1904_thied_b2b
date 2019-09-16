package com.sy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create By SHI_YAO On 2019/9/9
 */
@Controller
public class ViewController {
    /**
     * 未登录的首页
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 跳转到登录界面
     * @return
     */
    @RequestMapping("login")
    public String login(){
        return "login";
    }

    /**
     * 跳转到注册界面
     * @return
     */
    @RequestMapping("register")
    public String register(){
        return "Register";
    }

    /**
     * 跳转到登录后的首页
     * @return
     */
    @RequestMapping("main")
    public String main(){ return "main";}

    /**
     * 跳转到散标区的界面
     * @return
     */
    @RequestMapping("bnulkmark")
    public String bnulkmark(){
        return "bnulkmark";
    }

    /**
     * 跳转到转让区的界面
     * @return
     */
    @RequestMapping("transfer")
    public String transfer(){
        return "transfer";
    }

    /**
     * 跳转到平台信息披露界面
     * @return
     */
    @RequestMapping("information")
    public String Information(){
        return "information";
    }

    /**
     * 跳转到我要贷款界面
     * @return
     */
    @RequestMapping("credit")
    public String credit(){
        return "credit";
    }

    /**
     * 跳转到用户各人管理界面
     * @return
     */
    @RequestMapping("usermanager")
    public String usermanager(){
        return "usermanager";
    }

    /**
     * 跳转到我的出借界面
     * @return
     */
    @RequestMapping("myborrow")
    public String myborrow(){
        return "myborrow";
    }

    /**
     * 跳转到我的转让界面
     * @return
     */
    @RequestMapping("mytransfer")
    public String mytransfer(){
        return "mytransfer";
    }

    /**
     * 跳转到我的资金记录界面
     * @return
     */
    @RequestMapping("myfundrecord")
    public String myfundrecord(){
        return "myfundrecord";
    }

    /**
     * 跳转到我的账户资金界面
     * @return
     */
    @RequestMapping("myaccountfunds")
    public String myaccountfunds(){
        return "myaccountfunds";
    }

    /**
     * 跳转到我的账户设置界面
     * @return
     */
    @RequestMapping("myaccountsettings")
    public String myaccountsettings(){
        return "myaccountsettings";
    }

    /**
     * 跳转的实名认证的界面
     * @return
     */
    @RequestMapping("verified")
    public String Verified(){
        return "Verified";
    }

    /**
     * 跳转到绑定银行卡的界面
     * @return
     */
    @RequestMapping("bankcard")
    public String bankcard(){
        return "bankcard";
    }

    /**
     * 跳转到邮箱认证的界面
     * @return
     */
    @RequestMapping("email")
    public String email(){
        return "email";
    }

    /**
     * 修改基础个人信息
     * @return
     */
    @RequestMapping("userinfosetting")
    public String userinfosetting(){
        return "userinfosetting";
    }

    /**
     * 提交修改过得个人信息
     * @return
     */
    @RequestMapping("userinfoupdate")
    public String userinfoupdate(){
        return "myaccountsettings";
    }
}
