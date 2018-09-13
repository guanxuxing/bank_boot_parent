package com.boot.bank.service.impl;

import com.boot.bank.entity.QhReliabiltiyTemp;
import com.boot.bank.mapper.UserMapper;
import com.boot.bank.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by gxx on 2017-08-25.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;


    public void getUserById(String id) {
        QhReliabiltiyTemp tempInfo = new QhReliabiltiyTemp();
        tempInfo.setMobile("1868888888");
        tempInfo.setCredooScore("888");
        userMapper.addInfo(tempInfo);
        QhReliabiltiyTemp temp = userMapper.getInfo();
        String temp1 = userMapper.getInfoColums();
        logger.info("根据Id得到用户信息:");
        logger.info("temp:"+temp.toString());
        logger.info("temp1"+temp1.toString());
    }
}
