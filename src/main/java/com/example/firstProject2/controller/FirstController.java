package com.example.firstProject2.controller;
import com.example.firstProject2.dto.Articleform;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username","소이");
        return "gretting";
    }

    @GetMapping("/hi")
    public String heello() {
        return "gre";
    }

    @PostMapping ("/")
    public String goodbye(@RequestBody Articleform articleform) {
        System.out.println(articleform.toString());
       return "";
    }
}
