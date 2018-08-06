package com.postni.h2mybatis.web;

import com.postni.h2mybatis.domain.Member;
import com.postni.h2mybatis.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users",this.memberService.getUsers());
        return "user/users.jsp";
    }

    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable String id, Model model) {

        Member user =  memberService.getMemberDetail(id);
        model.addAttribute("user", user);
        return "user/userDetail.jsp";
    }

    @RequestMapping("/login")
    public String loginGet(HttpSession session){

        if (session.getAttribute("isLogin") != null) {
            boolean isLogin =  (boolean)session.getAttribute("isLogin");
            if (true == isLogin)
                return "redirect:/";
        }

        return "/login/login.jsp";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String loginPost(@RequestParam String id,
                            @RequestParam String password,
                            Model model,
                            HttpSession session) {

        if (memberService.loginCheck(id,password) == true) {
            session.setAttribute("isLogin", true);
            session.setAttribute("loginId", id);
            return "redirect:/";
        }
        else {
            model.addAttribute(
                    "errors",
                    new String[]{"id 와 password가 일치하지  않습니다."});
            return "/login/login.jsp";
        }
    }
}
