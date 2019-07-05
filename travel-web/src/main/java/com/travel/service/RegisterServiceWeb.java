package com.travel.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.travel.pojo.Result;
import com.travel.pojo.TbUser;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceWeb {

    @Reference
    private RegisterService registerService;

    public Result register(TbUser tbUser){
        try {
            System.out.println("tbUser:"+tbUser.getUsername()+tbUser.getPassword());
            registerService.register(tbUser);
            return new Result(true,"注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"注册失败");
        }
    }


}
