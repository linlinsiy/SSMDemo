package com.hafiz.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Desc:用户信息控制器
 * Created by hafiz.zhang on 2016/8/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {
/*

    @Autowired
    private UserService userService;
*/

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getAllUsers(){
        return "index";
    }
}
