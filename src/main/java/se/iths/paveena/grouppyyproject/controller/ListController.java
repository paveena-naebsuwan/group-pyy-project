package se.iths.paveena.grouppyyproject.controller;



import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/List")
public class ListController {

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("name", "Hello there");
        return "List";

    }


}
