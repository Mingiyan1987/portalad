package ru.basanov.portalad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.context.WebContext;
import ru.basanov.portalad.model.User;
import ru.basanov.portalad.repository.UserRepository;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String userList(Model model) {
        ExpressionParser parser = new SpelExpressionParser();
        List<String> listUser = null;
        Collection<User> users = userRepository.getListUser();
        for (User us: users) {
            listUser.add((String) parser.parseExpression("'login'").getValue(us));
        }
        model.addAttribute("listUser", listUser);
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
