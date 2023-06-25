package com.devstack.joblisting.controller;

import com.devstack.joblisting.model.User;
import com.devstack.joblisting.repo.UserRepository;
import com.devstack.joblisting.util.PasswordManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordManager passwordManager;


    @PostMapping("/saveuser")
    public String saveUser(@RequestBody User user) {
        user.setPassword(passwordManager.encrypt(user.getPassword()));
        List<User> allUsers = userRepository.findAll();
        for (User test:allUsers
             ) {
            if (test.getEmail().trim().equalsIgnoreCase(user.getEmail().trim())){
                return "User Allready exsist";
            }else {
                User savedUser = userRepository.save(user);
            }
        }
        return "User Saved";
    }


    @GetMapping("/findloginuser/{email}/{password}")
    public String findUser(@PathVariable String email, String password) {
        List<User> allUsers = userRepository.findAll();
        for (User test:allUsers
             ) {
            if (test.getEmail().trim().equalsIgnoreCase(email.trim())){
                System.out.println(test);
                if (passwordManager.checkPassword(password,test.getPassword())){
                    return "AccessConfirmed";
                }else{
                    return " WrongPassword" ;
                }
            }
        }
        return "CantFindUser";
    }


}
