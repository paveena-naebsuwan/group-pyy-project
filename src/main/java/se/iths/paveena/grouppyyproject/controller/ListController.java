package se.iths.paveena.grouppyyproject.controller;



import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.iths.paveena.grouppyyproject.model.ListModel;

@Controller
@RequestMapping("/List")
public class ListController {

    @GetMapping
    public String showList(Model model) {

        ListModel list = new ListModel(); //multiple items
        model.addAttribute("list", "Hello there");
        return "List";

    }

}
