package org.pplmnglld.controllers;

import org.pplmnglld.models.Role;
import org.pplmnglld.models.User;
import org.pplmnglld.services.UserService;

import java.util.List;

public class UserController {
private UserService userService= new UserService();

public void registerUser(String name, String email, Role role){
    userService.registerUser(name,email,role);
};

public void listAllUsers(){
    List<User> users  = userService.getAllUsers();
    for (User user : users){
        System.out.println(user);
    }
}
}
// //            System.out.println("List of users with role " + role + ": ");