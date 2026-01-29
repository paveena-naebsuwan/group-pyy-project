package se.iths.paveena.grouppyyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.paveena.grouppyyproject.model.User;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("/user")
    public String userPage(Model model) {

        List<User> users = List.of(
                new User(1,"paveenan","paveena.nabesuwan@iths.se"),
                new User(2,"yunus.u","yunus.uludag@iths.se"),
                new User(3,"yunus-can","yunus-can.yucel@iths.se")
        );
        model.addAttribute("users", users);
        model.addAttribute("isLoggedIn", true);
        return "user";
    }
}
