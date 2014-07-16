package com.thoughtworks;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HelloWorldController{
        private CalculatorClient calculatorClient;
        @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public String printHello(ModelMap model) {
            return "hello";
        }

       @Autowired
       public void setCalculator(CalculatorClient calculatorClient) {
           this.calculatorClient = calculatorClient;

       }
       @RequestMapping(value = "/add", method = RequestMethod.POST)
       public String getnumber(HttpServletRequest request, HttpServletResponse response,ModelMap model) {
           String add1 = request.getParameter("add1");
           String add2 = request.getParameter("add2");
           model.addAttribute("msg", calculatorClient.add(add1,add2));
           return "hello";
    }

    }