package com.user.service;

import com.user.dao.UserDao;
import com.user.dao.UserMapper;
import com.user.entiry.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
//    private UserMapper userMapper;

    public List<UserInfo> findall(){
        return userDao.findAll();
    }

    public String getName(String id){
        return null;
    }
}
