package com.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.user.entiry.UserInfo;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/getall")
    public ResponseEntity<JSONObject>  getAll(){
        JSONObject result = new JSONObject();
        List<UserInfo>  users = userService.findall();
        result.put("code",200);
        result.put("msg","success");
        result.put("result",users);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
