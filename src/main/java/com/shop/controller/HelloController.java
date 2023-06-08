package com.shop.controller;


import com.shop.repository.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello");

        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name")String name, Model model){
        model.addAttribute("name", name);

        return "hello-mvc";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloMvc(@RequestParam("name")String name){

        return "hello!!" + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public User helloApi(){
        User user = User.createUser("testhhh24Email@google.com", "pwd2", "sojin", "12345", "성남", "1238호");

        return user;
    }

}
