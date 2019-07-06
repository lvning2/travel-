package com.travel.handler;

import com.travel.pojo.Result;
import com.travel.pojo.TbUser;
import com.travel.service.RegisterService;
import com.travel.service.RegisterServiceWeb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TravelHandler {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @Resource
    private RegisterServiceWeb registerServiceWeb;

    @RequestMapping("/login")
    public String login(TbUser tbUser){
        return "";
    }

    @RequestMapping("/regist")
    @ResponseBody
    public String regist(TbUser tbUser){
        return registerServiceWeb.register(tbUser).getMsg();
    }

    @RequestMapping("/zz")
    public String regis(){
        return "regist";
    }

}
