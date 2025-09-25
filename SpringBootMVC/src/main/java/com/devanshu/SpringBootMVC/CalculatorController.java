package com.devanshu.SpringBootMVC;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String calculatorHome(){
        return "index";
    }

    @ModelAttribute
    public void modelData(Model m){
        m.addAttribute("name" , "Aliens");
    }

//    @RequestMapping("add")
//     We got parameters through HttpServletRequest
//    public String add(HttpServletRequest req){
//        int number1 = Integer.parseInt(req.getParameter("num1"));
//        int number2 = Integer.parseInt(req.getParameter("num2"));
//        int sum = number1 + number2;
//
//        HttpSession session = req.getSession();
//
//        session.setAttribute("sum" , sum);
//
//        return "result";
//    }


    // @ RequestParam
//    public String add(@RequestParam("num1") int number1 ,@RequestParam("num2") int number2 , HttpSession session){
//        int sum = number1 + number2;
//
//        session.setAttribute("sum" , sum);
//
//        return "result";
//    }

    // Model and view
//    public ModelAndView add(@RequestParam("num1") int number1 ,@RequestParam("num2") int number2 , HttpSession session){
//
//        ModelAndView mv = new ModelAndView();
//
//        mv.setViewName("result.jsp");
//
//        int sum = number1 + number2;
//
//        mv.addObject("sum" , sum);
//
//        return mv;
//    }


    // Model and (Model view : it is also used to get model object but with the help of map)

//    public ModelAndView add(@RequestParam("num1") int number1 ,@RequestParam("num2") int number2 , HttpSession session){
//
//        ModelAndView mv = new ModelAndView();
//
//        mv.setViewName("result.jsp");
//
//        int sum = number1 + number2;
//
//        mv.addObject("sum" , sum);
//
//        return mv;
//    }


//    @RequestMapping("addAlien")
//    public String addAlien(@RequestParam("aid") int aid , @RequestParam("aname") String aname , Model m){
//        Alien a = new Alien();
//        a.setAid(101);
//        a.setAname("Devanshu");
//
//        m.addAttribute("alien" , a);
//
//        return "result";
//    }

    // # Model Attribute
//    @RequestMapping("addAlien")
//    public String addAlien(@ModelAttribute("a1") Alien a , Model m){
//        m.addAttribute("alien" , a);
//
//        return "result";
//    }


    @GetMapping
    public String getAliens(Model m){
        List<Alien> aliens = Arrays.asList(new Alien(101 , "Devanshu") , new Alien(102 , "Payal"));

        m.addAttribute("result" , aliens);

        return "showAliens";
    }

    // # Model Attribute at Method Level
    @PostMapping(value = "addAlien")
    public String addAlien(@ModelAttribute Alien a){
        return "result";
    }


}
