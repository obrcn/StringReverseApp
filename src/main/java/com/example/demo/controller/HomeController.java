package com.example.demo.controller;

import com.example.demo.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping("/")
    public String getHomePage(org.springframework.ui.Model model)
    {
        model.addAttribute("textreverse", new Model());
        return "index";
    }
    @PostMapping("/deger")
    public String postHomePage (@ModelAttribute("textreverse") Model bean, org.springframework.ui.Model model)
    {
        String variable=bean.getTextField().toString();
        String newvariable=new StringBuffer(variable).reverse().toString();
        model.addAttribute("error", newvariable);
        return "index";
    }
}
