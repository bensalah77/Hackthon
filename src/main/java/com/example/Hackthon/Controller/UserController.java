package com.example.Hackthon.Controller;

import com.example.Hackthon.Model.User;
import com.example.Hackthon.Service.RolesServiceImpl;
import com.example.Hackthon.Service.UserServiceImpli;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.PostConstruct;
import javax.annotation.Resources;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpli userServiceImpli;
    private final RolesServiceImpl rolesService;
    @PostMapping("/add")
    public ResponseEntity<User>saveUser(@RequestBody User user){
        URI uri=URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api").toUriString());
        return ResponseEntity.created(uri).body(userServiceImpli.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        return  ResponseEntity.ok().body(userServiceImpli.getAllUsers());
    }
}
