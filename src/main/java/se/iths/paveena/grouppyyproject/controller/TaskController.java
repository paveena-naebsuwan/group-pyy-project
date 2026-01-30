package se.iths.paveena.grouppyyproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.iths.paveena.grouppyyproject.model.Task;

@Controller
@RequestMapping("/task")
public class TaskController {

    @GetMapping
    public String ShowTask(Model model) {

        Task task = new  Task("This is a task");
        model.addAttribute("task", task);
        return "task";
    }

    @PostMapping
    public String AddTask(Model model) {

        model.addAttribute("task", "This is a task");
        return "task";
    }
}
