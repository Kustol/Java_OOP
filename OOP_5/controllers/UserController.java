package OOP_5.controllers;


import OOP_5.model.Repository;
import OOP_5.model.User;
import OOP_5.model.ValidateUser;

import java.util.List;

public class UserController {
    private final Repository repository;

    private ValidateUser validator = new ValidateUser();


    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception {
        validator.check(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public List<User> readUsers() {
        return repository.getAllUsers();
    }

    public void deleteUser(String userId) {
        repository.deleteUser(userId);
    }
}