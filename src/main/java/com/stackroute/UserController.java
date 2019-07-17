package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping("/login")
    public ModelAndView hello(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String uname=httpServletRequest.getParameter("name");
        String password=httpServletRequest.getParameter("pass");
        User user=new User(uname,password);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("name",uname);
        modelAndView.addObject("pass",password);
        return modelAndView;
    }
}
