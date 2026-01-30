package se.iths.paveena.grouppyyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.paveena.grouppyyproject.model.Rating;

import java.util.List;

@Controller
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping
    public String getRatings(Model model) {

        List<Rating> ratings = List.of(
                new Rating(1L, "Adam", 5.0),
                new Rating(2L, "Bertil", 3.8),
                new Rating(3L, "Cesar", 3.4)
        );
        model.addAttribute("ratings", ratings);
        return "ratings";
    }

    @PostMapping
    public String createRating(Model model) {
        model.addAttribute("message", "Betyg lagt!");
        return "ratings";
    }
}