package com.example.springmvcform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FormController {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @GetMapping("/showForm")
    public String showForm() {
        return "form";
    }

    @PostMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) {
        setName(request.getParameter("name"));
        model.addAttribute("name", getName());
        return "result";
    }
}
