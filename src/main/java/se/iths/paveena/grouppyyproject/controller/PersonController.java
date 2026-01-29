package se.iths.paveena.grouppyyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.paveena.grouppyyproject.model.Person;

import java.util.List;

@Controller
public class PersonController {

    @GetMapping("/person")
    public String getComment(Model model) {
        List<Person> persons = List.of(
                new Person(1,"Gizmo","0795959999","Stockholm"),
                new Person(2,"Momo","0795959998","Umea"),
                new Person(3,"Sofia","0795959997","Uppsala")
        );
        model.addAttribute("persons", persons);
        return "person";
    }
}