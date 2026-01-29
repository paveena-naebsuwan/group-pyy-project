package se.iths.paveena.grouppyyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.paveena.grouppyyproject.model.Appointment;

import java.util.List;

@Controller
@RequestMapping("/")
public class AppointmentController {

    @GetMapping("/appointment")
    public String schedule(Model model) {
        List<Appointment> appointments = List.of(
                new Appointment(1,"2026-01-27","09:00"),
                new Appointment(2,"2026-01-28","10:00"),
                new Appointment(3,"2026-01-30","11:00")

        );
        model.addAttribute("appointments",appointments);
        return "appointment";
    }
}
