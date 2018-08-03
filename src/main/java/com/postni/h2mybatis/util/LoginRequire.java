package com.postni.h2mybatis.util;

import javax.servlet.http.HttpSession;

public class LoginRequire {

    public LoginRequire(){

    }

    public static boolean isLogin(HttpSession session) {

        if (session.getAttribute("isLogin") != null) {
            return (boolean)session.getAttribute("isLogin");
        }
        return false;
    }

    public static  String getLoginId(HttpSession session) {
        if (LoginRequire.isLogin(session) ){
            return  (String) session.getAttribute("loginId");
        }

        return ":::guest:::";
    }
}
