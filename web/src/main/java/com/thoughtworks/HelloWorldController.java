package com.thoughtworks;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController{


        @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public String printHello(ModelMap model) {
            model.addAttribute("msg", "Hello Spring MVC Framework!");
            return "hello";
        }

    }