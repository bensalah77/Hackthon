package com.example.Hackthon.Service;

import com.example.Hackthon.Model.User;

public interface UserService {
    User save(User user);
    void addRoleToUser(String name , String rolename);
    User getUser(String name);

}
