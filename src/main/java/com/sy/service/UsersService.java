package com.sy.service;

/**
 * Created by hx on 2019/9/16 20:29
 */
public interface UsersService {
    /**
     * @方法名: sendSimpleMail
     * @参数名：@param subject  邮件主题
     * @参数名：@param content 邮件主题内容
     * @参数名：@param from        发件人Email地址
     * @参数名：@param to         收件人Email地址
     * @描述语: 发送邮件
     */
    public void sendSimpleMail(String to,String title,String content);
}
