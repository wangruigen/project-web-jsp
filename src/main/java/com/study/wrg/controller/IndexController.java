package com.study.wrg.controller;

import com.study.wrg.entity.User;
import com.study.wrg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {
    private final UserService userService;
    @Autowired
    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/","/index"})
    public String index(Model model) throws Exception {

        List<User> userList = userService.getUserList();

        model.addAttribute("userList",userList);

        return "index";
    }
}
