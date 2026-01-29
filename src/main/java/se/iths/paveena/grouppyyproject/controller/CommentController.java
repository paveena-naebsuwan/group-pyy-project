package se.iths.paveena.grouppyyproject.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comments")
public class CommentController {

    @GetMapping
    public String getComments(Model model) {
        return "List";
    }

    @PostMapping
    public String createComment() {
        return "Comment";
    }
}
