package se.iths.paveena.grouppyyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comments")
public class CommentController {

    @GetMapping
    public String getComments(Model model) {
        model.addAttribute("message", "Lista med kommentarer");
        return "comments";
    }

    @PostMapping
    public String createComment(Model model) {
        model.addAttribute("message", "Kommentar skapad");
        return "comment-created";
    }
}