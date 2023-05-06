package com.example.Hackthon.Service;

import com.example.Hackthon.Model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    void addRoleToUser(String name , String rolename);
    User getUser(String name);
    List<User> getAllUsers() ;

}
