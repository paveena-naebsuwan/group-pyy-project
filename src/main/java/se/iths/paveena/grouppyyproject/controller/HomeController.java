package se.iths.paveena.grouppyyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String welcome(Model model){
        String greeting = "Välkommen yunus-can";
        model.addAttribute("greeting", greeting);
        return "welcome";
    }
}
