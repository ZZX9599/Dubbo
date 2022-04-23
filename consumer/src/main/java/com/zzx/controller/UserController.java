package com.zzx.controller;

import com.zzx.domain.User;
import com.zzx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author ZZX
 * @date 2022/4/23 15:20
 */

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/user")
    public String userDetails(Model model,Integer id){
        User user=userService.queryUserById(id);
        model.addAttribute("user",user);
        return "user";
    }
}
