package se.iths.paveena.grouppyyproject.controller;


import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import se.iths.paveena.grouppyyproject.model.Que;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/Que")
public class QueController {

    @GetMapping
    public String Que(Model model){
        Que que = new Que("this is a que");
        model.addAttribute("que", que);

        return "Que";
    }
    @PostMapping
    public String AddQue(Model model) {

        model.addAttribute("Que", "This is a Que");
        return "Que";
    }

}
