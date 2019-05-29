package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 请求参数绑定入门
 */
@Controller
@RequestMapping(path="/param")
public class ParamController {

    /**
     * 请求参数绑定入门
     * @param username 用户名
     * @param password 密码
     * @return success
     */
    @RequestMapping(path="/testParam")
    public String testParam(String username,String password){
        System.out.println("执行了！");
        System.out.println("用户名："+ username + "密码：" + password);
        return "success";
    }

    /**
     * 请求参数绑定：把数据封装到JavaBean中
     * @return
     */
    @RequestMapping(path="/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了......");
        System.out.println(account);
        return "success";
    }
}
