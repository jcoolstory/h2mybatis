package com.postni.h2mybatis.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EchoController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping("/testjsp")
    public String testJsp(Model model) {
        model.addAttribute("name","helllowrdfasl");
        return "test.jsp";
    }

    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }
}
