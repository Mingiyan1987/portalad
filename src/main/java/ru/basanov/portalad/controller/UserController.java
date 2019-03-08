package ru.basanov.portalad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.basanov.portalad.model.User;
import ru.basanov.portalad.repository.UserRepository;

import java.util.Map;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String userList(Model model) {
        model.addAttribute("users", userRepository.getListUser());
        return "list";
    }

    @RequestMapping("/authorization")
    public String authorization(Model model) {
        return "authorization";
    }

    @RequestMapping("/create")
    public String create() {
        userRepository.merge(new User());
        return "create";
    }


    @RequestMapping(value = {"/save"}, method = RequestMethod.POST)
    public String userSave(@ModelAttribute("user") User user) {
        userRepository.merge(user);
        return "list";
    }
}
