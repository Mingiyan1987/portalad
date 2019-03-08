package ru.basanov.portalad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private String message = "Всем привет";

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("message", this.message);
        return "index";
    }
}
