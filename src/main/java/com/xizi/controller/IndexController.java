package com.xizi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //跳转到登录页面
    @GetMapping("/index")
    public String toIndex(){
        return "ems/login";
    }

    //跳转到注册页面
    @GetMapping("/toRegister")
    public String toRegister(){
        return "ems/regist";
    }

    //跳转到保存用户页面
    @GetMapping("/toSave")
    public String toSave(){
        return "ems/addEmp";
    }
}
