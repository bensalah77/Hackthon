package com.example.Hackthon.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@Getter@Setter

public class User {

    public User(Long id, String username, String name, String prenom, String email, String password, Collection<Roles> roles) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public User(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private   Long id ;
    @Column
    private String username ;
    @Column
   private String name ;

    @Column
    String prenom ;
    @Column
    String email ;
    @Column
    String password ;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles" ,
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Roles> roles = new ArrayList<>();


    public User() {

    }
}
