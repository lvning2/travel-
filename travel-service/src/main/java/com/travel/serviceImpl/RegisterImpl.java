package com.travel.serviceImpl;

import com.travel.mapper.TbUserMapper;
import com.travel.pojo.Result;
import com.travel.pojo.TbUser;
import com.travel.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterImpl implements RegisterService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public Result register(TbUser tbUser) {
        System.out.println("-----------------service");

        System.out.println(tbUser.getUsername()+tbUser.getPassword());
        tbUserMapper.insert(tbUser);
        return new Result();
    }
}
