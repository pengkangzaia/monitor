package org.camille.monitor.web.controller;

import org.camille.monitor.service.UserService;
import org.camille.web.monitor.service.api.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 彭康
 * @create 2021-05-23 20:18
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/get")
    public Result<String> getPassword(String username) {
        Result<String> result = new Result<>();
        String res = userService.getPassword(username);
        result.setData(res);
        return result;
    }


}
