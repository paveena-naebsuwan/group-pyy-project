package se.iths.paveena.grouppyyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.paveena.grouppyyproject.model.Tag;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/tags")
public class TagController {

    @GetMapping
    public String tags(Model model) {

        List<Tag> tags = List.of(
                new Tag(1L, "Coding", LocalDateTime.now()),
                new Tag(1L, "JavaCoding", LocalDateTime.now()),
                new Tag(3L, "LearningToCode", LocalDateTime.now())
        );
        model.addAttribute("tags", tags);
        return "tags";
    }

    @PostMapping
    public String tagsPost(Model model, Tag tag) {
        model.addAttribute("message", "Tag skapad!");
        return "tags";
    }
}
