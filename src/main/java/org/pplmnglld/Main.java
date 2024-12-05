package org.pplmnglld;

import org.pplmnglld.controllers.UserController;
import org.pplmnglld.models.Role;
import org.pplmnglld.services.UserService;

/**
 * Entry point for testing the UserService functionality.
 */
public class Main {
    public static void main(String[] args) {
          UserController userController = new UserController();

          userController.registerUser("John Doe", "johnmail@mail.com", Role.STUDENT);
            userController.registerUser("Jane doe",    "jane@mail.com", Role.TEACHER);

            userController.listAllUsers();

    }
}
// //        }