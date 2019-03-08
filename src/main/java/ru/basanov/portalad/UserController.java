package ru.basanov.portalad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/authorization")
    public String authorization(Model model) {
        return "authorization";
    }

    @RequestMapping("/create")
    public String create() {
        return "create";
    }
}
