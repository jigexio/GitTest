package com.chn.controller;

import com.chn.pojo.MyUser;
import com.chn.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
/**
 * 控制器，对访问路径进行视图模型匹配
 */
@Controller
public class MyUserController {

    @Autowired
    private MyUserService myUserService;

    @RequestMapping("/select")
    public String select(MyUser myUser, Model model){
        List<MyUser> list = myUserService.selectUserByUname(myUser);
        model.addAttribute("userList",list);
        return "userList";
    }

}
