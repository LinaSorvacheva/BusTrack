package ru.aptech.bustrack.controllers;
import org.hibernate.annotations.common.reflection.XMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.aptech.bustrack.Entities.User;
import ru.aptech.bustrack.services.UserService;

import java.util.UUID;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String index(@RequestParam(value = "name", required = false) String name){
        System.out.println(name);
        return "index";
    }
}
