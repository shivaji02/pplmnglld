package org.pplmnglld.services;

import org.pplmnglld.models.Role;
import org.pplmnglld.models.User;
import org.pplmnglld.repositories.UserRepository;

import java.util.List;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * Service to manage users and their roles.
// */
//public class UserService {
//    private List<User> users; // Directly reference the User class, no generics
//
//    public UserService() {
//        this.users = new ArrayList<>();
//    }
//
//    /**
//     * Registers a new user with a role.
//     *
//     * @param name  Name of the user.
//     * @param email Email of the user.
//     * @param role  Role of the user.
//     */
//    public void registerUser(String name, String email, Role role) {
//        User user = new User(nextId++, name, email, role); // Ensure the User constructor exists
//        users.add(user);
//        System.out.println("User registered successfully: " +" "+ user);
//    }
//
//    /**
//     * Lists all users in the system.
//     */
//    public void listAllUsers() {
//        if (users.isEmpty()) {
//            System.out.println("No users found/registered.");
//        } else {
//            System.out.println("List of all users: ");
//            users.forEach(System.out::println);
//        }
//    }
//
//    /**
//     * Finds users by their role.
//     *
//     * @param role Role to filter users.
//     */
//    public void listUsersByRole(Role role) {
//        List<User> filteredUsers = users.stream()
//                .filter(user -> user.getRole() == role) // Ensure User has a getRole() method
//                .collect(Collectors.toList());
//
//        if (filteredUsers.isEmpty()) {
//            System.out.println("No users found with role: " + role);
//        } else {
//            System.out.println("List of users with role: " + role);
//            filteredUsers.forEach(System.out::println);
//        }
//    }
//}


public class UserService{
    private UserRepository userRepository = new UserRepository();

    public User registerUser(String name, String email ,Role role){
    if(userRepository.existsByEmail(email)){
        throw new IllegalArgumentException("User with email " + email + " already exists");
    }
    return userRepository.save(new  User(null,name,email,role));
}
public List<User> getAllUsers(){
    return userRepository.findAll();
}

}
