package com.example.Hackthon.Service;

import com.example.Hackthon.Model.Roles;
import com.example.Hackthon.Model.User;
import com.example.Hackthon.Repository.RolesRepo;
import com.example.Hackthon.Repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@Service @Transactional @Slf4j
public class UserServiceImpli implements UserService, UserDetailsService {

    @Autowired
    UserRepo userRepo;
    @Autowired
    RolesRepo rolesRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepo.findByUsername(username);
        if (user==null){
            log.error("user not found");
            throw new UsernameNotFoundException("user Not found ");}
            else {
                log.info("User found ");
            }

        Collection<SimpleGrantedAuthority> authorities=new ArrayList<>();
        user.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getName())));
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities);
    }
    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void addRoleToUser(String name, String rolename) {
       User user = userRepo.findByName(name);
        Roles roles = rolesRepo.findByName(rolename);
        user.getRoles().add(roles);

    }

    @Override
    public User getUser(String name) {
        return null;
    }


}
