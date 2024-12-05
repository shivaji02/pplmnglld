package org.pplmnglld.repositories;

import org.pplmnglld.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users = new ArrayList<>();
    private  Long nextId = 1l;

    public  User save(User user){
        user  = new User(nextId++,user.getName(),user.getEmail(),user.getRole());
        return user;
    };

    public Optional <User>findById(Long id){
        return users.stream().filter(user -> user.getId() == id).findFirst();    }

    public  List <User> findAll(){
        return new ArrayList<>(users);
    }

    public boolean existsByEmail(String email){
        return users.stream().anyMatch(user -> user.getEmail().equals(email));
    }
}
