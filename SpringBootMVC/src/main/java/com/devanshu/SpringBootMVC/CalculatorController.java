package com.devanshu.SpringBootMVC;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String calculatorHome(){
        return "index";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req){
        int number1 = Integer.parseInt(req.getParameter("num1"));
        int number2 = Integer.parseInt(req.getParameter("num2"));
        int sum = number1 + number2;

        HttpSession session = req.getSession();

        session.setAttribute("sum" , sum);

        return "result";
    }
}
